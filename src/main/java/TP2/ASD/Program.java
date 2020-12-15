package TP2.ASD;

import TP2.Llvm;
import TP2.SymbolTable;
import TP2.TypeException;

import java.util.ArrayList;

public class Program {
    ArrayList<ABSFunction> funs ;
   ArrayList <Instruction> instructions;
   SymbolTable symbolTable;// What a program contains. TODO : change when you extend the language
    public Program(ArrayList<ABSFunction> funs) {
      this.funs=funs;
      this.symbolTable=new SymbolTable();
    }

    // Pretty-printer
    public String pp() {
        String toReturn = "";
        for(ABSFunction f :this.funs) {
            if(f!=null){
            toReturn += f.pp();
            toReturn += "\n";}
        }
        return toReturn;
    }


    // IR generation
    public Llvm.IR toIR() throws Exception {
      // TODO : change when you extend the language
        ArrayList<Instruction.RetInstruction> ret_instructions = new ArrayList<Instruction.RetInstruction>();
        Instruction.RetInstruction toReturn = new Instruction.RetInstruction(new Llvm.IR(Llvm.empty(), Llvm.empty()));
        for(ABSFunction f :funs){
            toReturn.ir.append(f.toIR(symbolTable).ir);
        }
        return toReturn.ir;
    }
  }