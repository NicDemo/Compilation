package TP2.ASD;

import TP2.*;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;

public class RezFunction extends Expression {
    String name;
    List<Expression> params;
    Type type;
    public RezFunction(String name , List<Expression> params){
        this.name=name;
        this.params=params;
    }
    @Override
    public String pp() {
        String rez = name + "(";
        for (int i = 0; i<params.size();i++){
            if(i<params.size()-1){
            rez +=params.get(i).pp()+ ", ";
            }
            else{rez+=params.get(i).pp();}
        }
        rez+=")";
        return rez;
    }

    @Override
    public RetExpression toIR(SymbolTable symbolTable) throws TypeException, WrongParamFunctionCall {
        Llvm.IR ir = new Llvm.IR(Llvm.empty(),Llvm.empty());
        String rez = Utils.newtmp();

        //verification sur le call
        // bon nombre de param, pas de verif sur type
        SymbolTable.FunctionSymbol funcsym = (SymbolTable.FunctionSymbol) symbolTable.lookup(this.name);
        Expression.RetExpression to_return = new Expression.RetExpression(ir,funcsym.getReturnType(),rez);
        if(funcsym!=null){
            if(this.params.size()!=funcsym.nbparam()){
                throw  new WrongParamFunctionCall("wrong size arguments while calling "+this.name);
            }
        }
        SymbolTable.FunctionSymbol func = (SymbolTable.FunctionSymbol) symbolTable.lookup(name);
        this.type = func.getReturnType();

        // traitement args
        // ajout du code ir de chaque argument dans to_return
        List<RetExpression> retexp = new ArrayList<>();
        for(Expression p : params){
            retexp.add(p.toIR(symbolTable));

        }
        for(RetExpression r : retexp){
            to_return.ir.append(r.ir);
        }

        Llvm.Call call = new Llvm.Call(this.type.toLlvmType(),this.name,rez,retexp);
        to_return.ir.appendCode(call);
        return to_return;
    }
}
