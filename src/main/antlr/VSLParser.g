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

program returns [TP2.ASD.Program out]
    : {ArrayList<TP2.ASD.ABSFunction> programme =new ArrayList<>();}
    (f=function {programme.add($f.out);})+
    {$out = new TP2.ASD.Program(programme);} EOF
    ;


function returns [TP2.ASD.ABSFunction out]
// FUNCTION
:{ArrayList<String> params = new ArrayList<>();TP2.ASD.Type type;}
FUNC (INT_DECLARATION{type = new TP2.ASD.Int();}|
VOID_DECLARATION{type = new TP2.ASD.Void();}) name = IDENT
(LP (i= IDENT {params.add($i.getText());})* RP)
 ACCOLADE_OUVERT (inst = instruction) ACCOLADE_FERME
{$out = new TP2.ASD.Function(type,$name.getText(),params,$inst.out);}
|
// PROTOTYPE
PROTO {ArrayList<String> params = new ArrayList<>();TP2.ASD.Type type;}
(INT_DECLARATION {type = new TP2.ASD.Int();}|VOID_DECLARATION {type = new TP2.ASD.Void();})
name = IDENT (arg = IDENT {params.add($arg.getText());})*
{$out = new TP2.ASD.Protot(type,$name.getText(),params);}
;

instruction returns [TP2.ASD.Instruction out]
    //BLOC
    :ACCOLADE_OUVERT
    {ArrayList<TP2.ASD.DeclInstruction> decs = new ArrayList<TP2.ASD.DeclInstruction>();}
    {ArrayList<TP2.ASD.Instruction> instructions = new ArrayList<TP2.ASD.Instruction>();}
    (d=declaration {decs=$d.out;})* (i=instruction{instructions.add($i.out);})*
    {$out=new TP2.ASD.Bloc(decs,instructions);}
    ACCOLADE_FERME
    //IF
      |IF cond = expression THEN {boolean a = false;}
      	(i=instruction)
      	(ELSE (i1=instruction){a=true;})?
      	FI
      	{if(a){
      	    $out=new TP2.ASD.IF($cond.out,$i.out,$i1.out);
      	}else{
      	$out=new TP2.ASD.IF($cond.out,$i.out,null);}
      	}
    //WHILE
    |WHILE (cond=expression) DO (i=instruction) DONE {$out=new TP2.ASD.While($cond.out,$i.out);}
	// Affectation
	|ident =IDENT AFFECT e = expression {$out=new TP2.ASD.AffectationInstruction($ident.getText(),$e.out); }
    //RETURN
    |RETURN e=expression {$out = new TP2.ASD.Return($e.out);}
    //PRINT
    |PRINT {ArrayList<TP2.ASD.Expression> expressions = new ArrayList<>();}
     		(e = expression {expressions.add($e.out);} VIRGULE)* (e2=expression {expressions.add($e2.out);})
     		{$out = new TP2.ASD.Print(expressions);}
    |READ id=IDENT {$out = new TP2.ASD.Read($id.getText());}
   ;

declaration returns [ArrayList<TP2.ASD.DeclInstruction> out]
    : {ArrayList<TP2.ASD.DeclInstruction> decls = new ArrayList<TP2.ASD.DeclInstruction>(); }
      ( INT_DECLARATION ident=IDENT {decls.add(new TP2.ASD.IntegerDeclaration($ident.getText()));} )(VIRGULE ident2=IDENT {decls.add(new TP2.ASD.IntegerDeclaration($ident2.getText()) );})*
       {$out=decls;}
    ;

expression returns [TP2.ASD.Expression out]
    : l=factor PLUS r=expression  { $out = new TP2.ASD.AddExpression($l.out, $r.out);}
    | l=factor SUB r = expression {$out= new TP2.ASD.SubExpression($l.out,$r.out);}
    | l=factor DIV r = expression {$out= new TP2.ASD.DivExpression($l.out,$r.out);}
    | l=factor MUL r = expression {$out = new TP2.ASD.MulExpression ($l.out,$r.out);}
    | f=factor { $out = $f.out; }
    // | SUB f=factor {$out=new TP2.ASD.SubExpression("0",$f.out);}
    ;

factor returns [TP2.ASD.Expression out]
    : p=primary { $out = $p.out; }
    |id=IDENT {$out = new TP2.ASD.VariableExpression($id.getText());}
    //functionRez
    |id = IDENT LP {ArrayList<TP2.ASD.Expression> expressions = new ArrayList<>();}
    (exp = expression{expressions.add($exp.out);}
     (VIRGULE exp2 = expression {expressions.add($exp2.out);})*)? RP
     {$out = new TP2.ASD.RezFunction($id.getText(),expressions);}
    // TODO : that's all?
    ;

primary returns [TP2.ASD.Expression out]
    : INTEGER { $out = new TP2.ASD.IntegerExpression($INTEGER.int); }
   //:  str=TEXT {$out= new TP2.ASD.StringExpression($TEXT.getText());}

    // TODO : that's all?
    ;

 
    
    
    
    
    