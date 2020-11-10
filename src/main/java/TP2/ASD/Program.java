package TP2.ASD;

import TP2.Llvm;
import TP2.TypeException;

import java.util.ArrayList;

public class Program {
   // Expression e;
   ArrayList <Instruction> instructions;// What a program contains. TODO : change when you extend the language
    public Program(ArrayList<Instruction> instruction) {
      //this.e = e;
      this.instructions=instruction;
    }

    // Pretty-printer
    public String pp() {
        String s="";
        for(Instruction p : instructions) {

           s=s+p.pp()+"\n";
        }
        return s;
    }

    // IR generation
    public Llvm.IR toIR() throws Exception {
      // TODO : change when you extend the language

      // computes the IR of the expression
     // Expression.RetExpression retExpr = e.toIR();
        ArrayList<Instruction.RetInstruction> ret_instructions = new ArrayList<Instruction.RetInstruction>();
        Instruction.RetInstruction toReturn = new Instruction.RetInstruction(new Llvm.IR(Llvm.empty(), Llvm.empty()));
        for(Instruction p : instructions){
     toReturn.ir.append(p.toIR().ir);
        }
return toReturn.ir;
        // add a return instruction
     // Llvm.Instruction ret = new Llvm.Return(retExpr.type.toLlvmType(), retExpr.result);
      //retExpr.ir.appendCode(ret);

      //return retExpr.ir;

    }
  }