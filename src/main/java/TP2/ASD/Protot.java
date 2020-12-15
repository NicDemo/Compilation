package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.VariableAlreadydeclared;

import java.util.ArrayList;
import java.util.List;

public class Protot extends ABSFunction{
    public Protot(Type type , String name, ArrayList<String> params){
        this.type = type;
        this.params= params;
        this.name=name;
    }

    @Override
    public String pp() {
        String rez = "PROTO "+type.pp()+" "+name+"(";
        for (int i = 0; i<params.size();i++){
            rez +=params.get(i)+ ", ";
        }
        return rez+")";
    }

    @Override
    public RetFunction toIR(SymbolTable symbolTable) throws Exception {
        Llvm.IR ir = new Llvm.IR(Llvm.empty(),Llvm.empty());
        RetFunction to_return = new RetFunction(ir);
        Boolean defined = false;
        List< SymbolTable.VariableSymbol > arguments = new ArrayList<>();
        Type t = new Int();
        for(String s : params){
            if(!arguments.add(new SymbolTable.VariableSymbol(new Int(),s))){
                throw new VariableAlreadydeclared("failed adding "+s+ "into variablelistsymbol");
            }

        }
        SymbolTable.FunctionSymbol F = new SymbolTable.FunctionSymbol(this.type,this.name,arguments,defined);
        if(!symbolTable.add(F)){
            throw new VariableAlreadydeclared(this.name+" fun already in scope");
        }
   return  to_return;
    }
}
