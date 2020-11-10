package TP2.ASD;

import TP2.Llvm;
import TP2.Utils;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class IF extends Instruction{
    Expression cond ;
    ArrayList<Instruction> instruction = new ArrayList<>();
    public IF (Expression exp,ArrayList<Instruction> inst){
        this.cond=cond;
        this.instruction = inst;
    }
    @Override
    public String pp() {
        String rez ="";
        rez+= Utils.indent(0)+"IF("+this.cond.pp()+">0) { \n";
        rez+=Utils.indent(1)+"THEN"+Utils.indent(2);

        for (Instruction i : instruction){
            rez+=i.pp()+"\n";
        }
        Utils.indent(0);
        rez+="FI \n";
        return rez;
    }

    @Override
    public RetInstruction toIR() throws Exception {
        RetInstruction ret = new RetInstruction(new Llvm.IR(Llvm.empty(), Llvm.empty()));
        String icmp_tmp = Utils.newtmp();
        Expression.RetExpression expReturn = cond.toIR();
// ICMP comparaison
        Llvm.Instruction icmp_result = new Llvm.Icmp(expReturn.type.toLlvmType(), expReturn.result, icmp_tmp);
        ret.ir.appendCode(icmp_result);
        // instruction de branchement
        String label_true = Utils.newlab("then");
        String label_false = Utils.newlab("fi");
        //branchement
        Llvm.Instruction br_result = new Llvm.Br(icmp_tmp, label_true, label_false);
        ret.ir.appendCode(br_result);
        Llvm.Label labelT= new Llvm.Label(label_true);
        ret.ir.appendCode(labelT);
        //then
        for(Instruction p : instruction){
        ret.ir.append(p.toIR().ir);}
        //fin if
        //branchement
        Llvm.Instruction False = new Llvm.Br(label_false);
        ret.ir.appendCode(False);
        Llvm.Label labelF= new Llvm.Label(label_false);
        ret.ir.appendCode(labelF);
        return ret;
    }
}

