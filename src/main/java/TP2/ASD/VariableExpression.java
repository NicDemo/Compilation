package TP2.ASD;

import TP2.Main;
import TP2.SymbolTable;
import TP2.TypeException;
import TP2.Utils;

public class VariableExpression extends Expression{
    String id;
    VariableExpression(String id){
        this.id=id;
    }
    @Override
    public String pp() {
        return this.id;
    }

    @Override
    public RetExpression toIR() throws TypeException {
        String result = new TP2.Utils.newtmp();
        SymbolTable.VariableSymbol symb = (SymbolTable.VariableSymbol) Main.tabsymb.lookup(id);
        return null;
    }
}
