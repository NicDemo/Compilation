package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.VariableAlreadydeclared;

import java.util.ArrayList;
import java.util.List;

public class Function extends Protot{
    Instruction i ;

    public Function( Type type, String name,ArrayList<String> params,Instruction i) {
    super(type,name,params);
    this.i=i;
    }
    @Override
    public String pp(){
        String rez = "FUNC " + type.pp()+" "+ name+"(";
        if(params.size()>0) {
            for (int i = 0; i < this.params.size(); i++) {
                if (i < this.params.size() - 1) {
                    rez += params.get(i) + ',';
                } else {
                    rez += params.get(i) + "){ \n";
                }
            }
        }
        else{rez+="){\n";}
        rez+=i.pp()+"}";

        return  rez;
    }

    @Override
    public RetFunction toIR(SymbolTable symbolTable) throws Exception {
        Llvm.IR ir = new Llvm.IR(Llvm.empty(), Llvm.empty());
        RetFunction ret = new RetFunction(ir);
        List<SymbolTable.VariableSymbol> arguments = new ArrayList<>();
        Type t = new Int();
        for (String s : params) {
            if (!arguments.add(new SymbolTable.VariableSymbol(new Int(), s))) {
                throw new VariableAlreadydeclared("failed adding " + s + "into variablelistsymbol");
            }
        }
        SymbolTable.FunctionSymbol F = new SymbolTable.FunctionSymbol(this.type,this.name,arguments,true);
        if(symbolTable.lookup(this.name)==null) {
            if (!symbolTable.add(F)) {
                throw new Exception("can't add func " + this.name);
            }
        }
        else {
            symbolTable.remove(this.name);
            if (!symbolTable.add(F)) {
                throw new Exception("can't add func " + this.name);
            }
        }
        Llvm.Start Func = new Llvm.Start(this.type.toLlvmType(), this.name,this.params);
        ret.ir.appendCode(Func);
        Llvm.Ending Funcend = new Llvm.Ending(type.toLlvmType(),name,params);
        ret.ir.append(this.i.toIR(symbolTable).ir);
        ret.ir.appendCode(Funcend);
        return ret;
    }
}
