package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;

public class Return extends Instruction{
  Expression exp ;
    public  Return (Expression E){
        this.exp = E;
    }
    @Override
    public String pp() {
        String rez ="RETURN "+exp.pp()+"\n";
        return rez;
    }

    @Override
    public RetInstruction toIR(SymbolTable symbolTable) throws Exception {
        Llvm.IR ir = new Llvm.IR(Llvm.empty(),Llvm.empty());
        RetInstruction to_return = new RetInstruction(ir);
        Type type = exp.toIR(symbolTable).type;
        String rez = exp.toIR(symbolTable).result;
        //création instruction de retour
        Llvm.Return RETURN = new Llvm.Return(type.toLlvmType(),rez);
        to_return.ir.append(exp.toIR(symbolTable).ir);
        to_return.ir.appendCode(RETURN);

        return to_return;
    }
}
