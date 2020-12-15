package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;

import java.util.ArrayList;

public class Print extends  Instruction{
    ArrayList<Expression> to_print;
    public  Print (ArrayList<Expression> print){
        to_print=print;
    }

    @Override
    public String pp() {
        String rez="PRINT ";
        for(Expression exp:to_print) {
            rez += exp.pp() + ", ";
        }
        return rez;
    }

    @Override
    public RetInstruction toIR(SymbolTable symbolTable) throws Exception {
        return new RetInstruction(new Llvm.IR(Llvm.empty(), Llvm.empty()));
    }
}
