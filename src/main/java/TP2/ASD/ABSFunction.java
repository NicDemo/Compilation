package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.VariableAlreadydeclared;

import java.util.ArrayList;

public abstract class ABSFunction {
    ArrayList<String> params ;
    String name ;
    Type type;

    public abstract String pp();

    public static class RetFunction{
        public Llvm.IR ir;
        public RetFunction(Llvm.IR ir) {
            this.ir = ir;
        }
    }


    public abstract RetFunction toIR(SymbolTable symbolTable) throws Exception;
}
