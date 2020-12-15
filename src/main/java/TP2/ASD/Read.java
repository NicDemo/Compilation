package TP2.ASD;

import TP2.SymbolTable;
import TP2.TypeException;
import TP2.Utils;

public class Read extends  Instruction{

    private String R;

    public Read (String R) {
        this.R = R;
    }

    public String pp() {
        return "READ " + R;
    }


    @Override
    public RetInstruction toIR(SymbolTable tabsymb) throws Exception {
        return null;
    }
}
