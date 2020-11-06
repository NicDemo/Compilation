parser grammar VSLParser;

options {
  language = Java;
  tokenVocab = VSLLexer;
}

@header {
  package TP2;

  import java.util.stream.Collectors;
  import java.util.Arrays;
}


// TODO : other rules


program returns [TP2.ASD.Program out]
  : d =declaration EOF {$out=new TP2.ASD.Program($d.out);}
  //  : e=expression EOF { $out = new TP2.ASD.Program($e.out); } // TODO : change when you extend the language
    ;
    
    
//instruction returns [TP2.ASD.Instruction out]
//	: ident =IDENT AFFECT e = expression {$out= new TP2.ASD.AffectationInstruction($ident.getText(),$e.out); }
  //  ;

declaration returns [ArrayList<TP2.ASD.Instruction> out]
    : {ArrayList<TP2.ASD.Instruction> decls = new ArrayList<TP2.ASD.Instruction>(); }
      ( INT_DECLARATION ident=IDENT {decls.add(new TP2.ASD.IntegerDeclaration($ident.getText()));} )(VIRGULE ident2=IDENT {decls.add(new TP2.ASD.IntegerDeclaration($ident2.getText()) );})*
       {$out=decls;}
    ;

//expression returns [TP2.ASD.Expression out]
  //  : l=factor PLUS r=expression  { $out = new TP2.ASD.AddExpression($l.out, $r.out);}
    //| l=factor SUB r = expression {$out= new TP2.ASD.SubExpression($l.out,$r.out);}
    //| l=factor DIV r = expression {$out= new TP2.ASD.DivExpression($l.out,$r.out);}
   // | l=factor MUL r = expression {$out = new TP2.ASD.MulExpression ($l.out,$r.out);}
    //| f=factor { $out = $f.out; }
    //| SUB f=factor {$out=TP2.ASD.Expression}
	// AFFECTATION	

    // TODO : that's all?
    //;

factor returns [TP2.ASD.Expression out]
    : p=primary { $out = $p.out; }

    // TODO : that's all?
    ;

primary returns [TP2.ASD.Expression out]
    : INTEGER { $out = new TP2.ASD.IntegerExpression($INTEGER.int); }
   //:  str=TEXT {$out= new TP2.ASD.StringExpression($TEXT.getText());}
    // TODO : that's all?
    ;

 
    
    
    
    
    