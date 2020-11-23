package TP2.ASD;

import TP2.*;

public class VariableExpression extends TP2.ASD.Expression{
    public String id;
    public VariableExpression(String id){
        this.id=id;
    }
    @Override
    public String pp() {
        return this.id;
    }

    @Override
    public RetExpression toIR() throws TypeException {
        String tmp = TP2.Utils.newtmp();
        SymbolTable.VariableSymbol symb = (SymbolTable.VariableSymbol) Main.tabsymb.lookup(id);
        RetExpression retExpression = new RetExpression(new Llvm.IR(Llvm.empty(), Llvm.empty()),symb.getType(),tmp);
        Llvm.Instruction inst = new Llvm.Load(symb.getType().toLlvmType(), id, tmp);
        retExpression.ir.appendCode(inst);
        return retExpression;

    }
}




