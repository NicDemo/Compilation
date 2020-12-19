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

        return rez.substring(0,rez.length()-2);
    }

    @Override
    public RetInstruction toIR(SymbolTable symbolTable) throws Exception {
        TP2.ASD.Int integ= new Int();
        ArrayList <Expression.RetExpression> param = new ArrayList<>();
        Llvm.IR ir  = new Llvm.IR(Llvm.empty(), Llvm.empty());
        RetInstruction ret = new RetInstruction(ir);
        for(Expression e : to_print){
            param.add(e.toIR(symbolTable));
        }
        for(Expression.RetExpression e : param){
        ret.ir.append(e.ir);
        }
        Llvm.Call call = new Llvm.Call(integ.toLlvmType(),"Printf","",param);
        ret.ir.appendCode(call);
         return ret;


    }
}
