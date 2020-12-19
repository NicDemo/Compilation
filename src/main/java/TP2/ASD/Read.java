package TP2.ASD;

import TP2.Llvm;
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
        Llvm.IR ir=new Llvm.IR(Llvm.empty(),Llvm.empty());
        RetInstruction ret = new RetInstruction(ir);

        Llvm.Call call =  new Llvm.Call(new Int().toLlvmType(),"Scanf",R,null);
        ret.ir.appendCode(call);
        Llvm.Affect affect = new Llvm.Affect(new Int().toLlvmType(),R,R);
        ret.ir.appendCode(affect);
        return ret;
    }
}
