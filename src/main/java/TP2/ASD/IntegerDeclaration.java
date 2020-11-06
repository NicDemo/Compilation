package TP2.ASD;
import TP2.*;
import TP2.TypeException;
import jdk.jshell.execution.Util;

import java.util.ArrayList;

public class IntegerDeclaration extends DeclInstruction {
    private final String id;

    public IntegerDeclaration(String ident) {
        this.id = ident;
    }

    @Override
    public String pp() {
        return ( "INT " + id+ "\n");
    }


    @Override
    public RetInstruction toIR()  {
        SymbolTable.VariableSymbol Symb = new SymbolTable.VariableSymbol(new Int(),this.id);
        Main.tabsymb.add(Symb);// on ajoute le Symbol correspondant a this dans la table symb
        ArrayList<Llvm.Instruction> inst = new ArrayList<>();
        Llvm.Decl declinst= new Llvm.Decl(new Int().toLlvmType(),id );
        inst.add(declinst);
        Llvm.IR ir = new Llvm.IR(Llvm.empty(),inst);
        RetInstruction ret = new RetInstruction(ir);
        return ret;

    }
}
