package TP2.ASD;

import TP2.TypeException;

import TP2.Llvm;
import TP2.Utils;
public class MulExpression extends Expression {
	Expression left;
	Expression right;
	
	public MulExpression(Expression left, Expression right) {
		this.left=left;
		this.right=right;
	}
	public String pp() {
		return ("("+ left.pp() + "*" + right.pp() +")");
	}
	 public RetExpression toIR() throws TypeException {
	      RetExpression leftRet = left.toIR();
	      RetExpression rightRet = right.toIR();

	      
	      if(!leftRet.type.equals(rightRet.type)) {
	        throw new TypeException("mismatch type with: "+ leftRet.type + " and " + rightRet.type);
	      }
	     
	    	  // leftIr concat rightIr
	    	  leftRet.ir.append(rightRet.ir);
	    	 // new identifier for the result
	    	  String result = Utils.newtmp();
	    	   Type type = leftRet.type;
	    	   // add the instruction mul to the main code
	    	   Llvm.Instruction mul = new Llvm.Mul(leftRet.type.toLlvmType(), leftRet.result, rightRet.result,result);
	    	   leftRet.ir.appendCode(mul);
	    	   // return the generated ir expression and where to find it 
	    	   return new RetExpression(leftRet.ir, type, result);
	    	   
	 }
	
}
