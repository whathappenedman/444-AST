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
		
			/*
			1 - Pgm
			2 - BBlock
			3 - Vargroup
			4 - PPvarlist
			5 - Varlist
			6 - Vardecl
			7 - Basekind
			8 - Varid
			9 - Stmts
			10 - Stmt
			11 - Stasgn
			12 - Stprint
			13 - Stwhile
			14 - PPexprs
			15 - PPexpr1
			16 - Exprlist
			17 - Moreexprs
			18 - Expr'
			19 - Expr
			20 - Rterm'
			21 - Rterm
			22 - Term'
			23 - Term
			24 - Fact
			25 - Oprel
			26 - Lthan
			27 - Gthan
			28 - Opadd
			29 - Opmul
			*/
			
		//Stack and it's manipulation
		Stack<int> s = new Stack<>();
		s.push("Pgm");	//so it runs the first time
		stacktop = s.peek();
		if (stacktop > 0) {
			table_entry = ParseTable(stacktop, abs(token_number));	
			switch (table_entry) {
				case 1:	//Pgm = kwdprog BBlock

					s.pop();
					s.push("2");
					//s.push("kwdprog");
					break;
				case 2: //BBlock = brace1 Vargroup Stmts brace2
					s.pop();
					//s.push("}");
					s.push("9");
					s.push("3");
					//s.push("{");
					break;
				case 3: //Vargroup = kwdvars PPvarlist
					s.pop();
					s.push("4");
					//s.push("kwdvars");
					break;
				case 4:	//Vargroup = eps
					break;
				case 5: //PPvarlist = parens1 Varlist parens2
					s.pop();
					//s.push(")");
					s.push("5");
					//s.push("(");
					break;
				case 6: //Varlist = Vardecl semi Varlist
					s.pop();
					s.push("5");
					//s.push(";");
					break;
				case 7: //Varlist = eps
					break;
				case 8: //Vardecl = Basekind Varid
					s.pop();
					s.push("8");
					s.push("7");
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
					s.push("9");
					break;
				case 14: //Stmts = eps
					s.pop();
					break;
				case 15: //Stmt = Stasgn
					s.pop();
					s.push("11");
					break;
				case 16: //Stmt = Stprint
					s.pop();
					s.push("12");
					break;
				case 17: //Stmt = Stwhile
					s.pop();
					s.push("13");
					break;
				case 18: //Stasgn = Varid equal Expr
					s.pop();
					s.push("19");
					//equal
					s.push("8");
					break;
				case 19: //Stprint = kprint PPexprs
					s.pop();
					s.push("14");
					//kprint
					break;
				case 20: // Stwhile = kwdwhile PPexpr1 BBlock
					s.pop();
					s.push("2");
					s.push("15");
					//kdwhile
					break;
				case 21: // PPexprs = parens1 Exprlist parens2
					s.pop();
					//parens2
					s.push("16");
					//parens1
					break;
				case 22: // PPexpr1 = parens1 Expr parens2
					s.pop();
					//parens2
					s.push("19");
					//parens1
					break;
				case 23: // Exprlist = Expr Moreexprs
					s.pop();
					s.push("17");
					s.push("19");
					break; 
				case 24:// Moreexprs = comma Exprlist
					s.pop();
					s.push("16");
					//comma
					break;
				case 25: // Moreexprs = eps
					s.pop();
					break;
				case 26: // Expr' = Oprel Rterm Expr'
					s.pop();
					
					break;
				case 27: // Expr = Rterm
					s.pop();
					s.push("21");
					break;
				case 28: // Rterm' = Opadd Term Rterm'
					s.pop();
					break;
				case 29: // Rterm = Term
					s.pop();
					s.push("23");
					break;
				case 30:// Term' = Opmul Fact Term'
					s.pop();
					break;
				case 31: // Term = Fact
					s.pop();
					s.push("24");
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
					s.push("15");
					break;
				case 37: // Oprel = opeq
					s.pop();
					break;
				case 38: // Oprel = opne
					s.pop();
					break;
				case 39: // Oprel = Lthan
					s.pop();
					s.push("26");
					break;
				case 40:// Oprel = ople
					s.pop();
					break;
				case 41: // Oprel = opge
					s.pop();
					break;
				case 42: // Oprel = Gthan
					s.pop();
					s.push("27");
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
