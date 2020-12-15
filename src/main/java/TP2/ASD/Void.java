package TP2.ASD;

import TP2.Llvm;

public class Void extends Type{
    public Void(){

    }
    @Override
    public String pp() {
        return "VOID";
    }
    @Override public boolean equals(Object obj) {
        return obj instanceof Void;
    }

    @Override
    public Llvm.Type toLlvmType() {
        return new Llvm.Void();
    }

}
