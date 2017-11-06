import node;
import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "kwdprog { int }";
		Scanner kb = new Scanner(test);

		/*
		String x = "";
		ParseTable pt = new ParseTable();
		while (kb.hasNext()){
			x = kb.next();
			if (x.equals("-1")){
				break;
			}
			System.out.println(x);
		*/
		
		int token_number;
		String current_token = "";
		//current_token = kb.next();			//Add after testing
		while (kb.hasNext()) {
			current_token = kb.next();			//testing. Remove after
			switch (current_token) {
				case "kwdprog":
					token_number = -1;
					//System.out.println("kwdprog");
					break;
				case "kwdvars":
					token_number = -2;
					break;
				case "kprint":
					token_number = -3;
					break;
				case "kwdwhile":
					token_number = -4;
					break;
				case "int":	
					token_number = -5;
					break;
				case "float":
					token_number = -6;
					break;
				case "string":
					token_number = -7;
					break;
				case "id":
					token_number = -8;
					break;
				case "(":
					token_number = -9;
					break;	
				case ")":
					token_number = -10;
					break;	
				case "{":
					token_number = -11;
					//System.out.println("{");
					break;	
				case "}":
					token_number = -12;
					//System.out.println("}");
					break;	
				case ";":
					token_number = -13;
					break;	
				case ",":
					token_number = -14;
					break;	
				case "=":
					token_number = -15;
					break;	
				case "==":
					token_number = -16;
					break;	
				case "!=":
					token_number = -17;
					break;	
				case "<":
					token_number = -18;
					break;	
				case "<=":
					token_number = -19;
					break;	
				case ">=":
					token_number = -20;
					break;	
				case ">":
					token_number = -21;
					break;	
				case "+":
					token_number = -22;
					break;
				case "-":
					token_number = -23;
					break;
				case "*":
					token_number = -24;
					break;
				case "/":
					token_number = -25;
					break;
				case "^":
					token_number = -26;
					break;
				default:
					token_number = -27;
					//System.out.println("non terminal");
					break;
			}
		
		//Stack and it's manipulation
		Stack<String> s = new Stack<>();
		s.push("Pgm");	//so it runs the first time
		stacktop = s.peek();
		if (stacktop > 0) {
			table_entry = ParseTable(stacktop, abs(token_number));	
			switch (table_entry) {
				case 1:	//Pgm = kwdprog BBlock
					//TODO create Tree Node
					
					s.pop();
					s.push("BBlock");
					//s.push("kwdprog");
					break;
				case 2: //BBlock = brace1 Vargroup Stmts brace2
					s.pop();
					//s.push("}");
					s.push("Stmts");
					s.push("Vargroup");
					//s.push("{");
					break;
				case 3: //Vargroup = kwdvars PPvarlist
					s.pop();
					s.push("PPvarlist");
					//s.push("kwdvars");
					break;
				case 4:	//Vargroup = eps
					break;
				case 5: //PPvarlist = parens1 Varlist parens2
					s.pop();
					//s.push(")");
					s.push("Varlist");
					//s.push("(");
					break;
				case 6: //Varlist = Vardecl semi Varlist
					s.pop();
					s.push("Varlist");
					//s.push(";");
					break;
				case 7: //Varlist = eps
					break;
				case 8: //Vardecl = Basekind Varid
					s.pop();
					s.push("Varid");
					s.push("Basekind");
					break;
				case 9: //Basekind = int
					s.pop();
					break;
				case 10: //Basekind = float
					s.pop();
					break;
				case 11: //Basekind = string
					s.pop();
					break;
				case 12: //Varid = id
					s.pop();
					break;
				case 13: //Stmts = Stmt semi Stmts
					s.pop();
					break;
				case 14: //Stmts = eps
					s.pop();
					break;
				case 15: //Stmt = Stasgn
					s.pop();
					break;
				case 16: //Stmt = Stprint
					s.pop();
					break;
				case 17: //Stmt = Stwhile
					s.pop();
					break;
				case 18: //Stasgn = Varid equal Expr
					s.pop();
					break;
				case 19: //Stprint = kprint PPexprs
					s.pop();
					break;
				case 20: // Stwhile = kwdwhile PPexpr1 BBlock
					s.pop();
					break;
				case 21: // PPexprs = parens1 Exprlist parens2
					s.pop();
					break;
				case 22: // PPexpr1 = parens1 Expr parens2
					s.pop();
					break;
				case 23: // Exprlist = Expr Moreexprs
					s.pop();
					break; 
				case 24:// Moreexprs = comma Exprlist
					s.pop();
					break;
				case 25: // Moreexprs = eps
					s.pop();
					break;
				case 26: // Expr' = Oprel Rterm Expr'
					s.pop();
					break;
				case 27: // Expr = Rterm
					s.pop();
					break;
				case 28: // Rterm' = Opadd Term Rterm'
					s.pop();
					break;
				case 29: // Rterm = Term
					s.pop();
					break;
				case 30:// Term' = Opmul Fact Term'
					s.pop();
					break;
				case 31: // Term = Fact
					s.pop();
					break;
				case 32: //Fact = int
					s.pop();
					break;
				case 33: // Fact = float
					s.pop();
					break;
				case 34: //Fact = string
					s.pop();
					break;
				case 35: // Fact = Varid
					s.pop();
					break;
				case 36: // Fact = PPexpr1
					s.pop();
					break;
				case 37: // Oprel = opeq
					s.pop();
					break;
				case 38: // Oprel = opne
					s.pop();
					break;
				case 39: // Oprel = Lthan
					s.pop();
					break;
				case 40:// Oprel = ople
					s.pop();
					break;
				case 41: // Oprel = opge
					s.pop();
					break;
				case 42: // Oprel = Gthan
					s.pop();
					break;
				case 43: // Lthan = angle1
					s.pop();
					break;
				case 44: // Gthan = angle2
					s.pop();
					break;
				case 45: // Opadd = plus
					s.pop();
					break;
				case 46: // Opadd = minus
					s.pop();
					break;
				case 47: // Opmul = aster
					s.pop();
					break;
				case 48: //Opmul = slash
					s.pop();
					break;
				case 49: // Opmul = caret
					s.pop();
					break;
				case 50: // POP error
					System.out.println("Pop Error");
					break;
				case 51: // SCAN error
					System.out.println("Scan Error");
					break;
				default:
					System.out.println("Error");
					break;
					

		}
	}	
}
