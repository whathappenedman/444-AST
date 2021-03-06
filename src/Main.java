//import node;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	private static Stack<Integer> s = new Stack<Integer>();
	private static int token_number;
	private static int stacktop;
	private static int kill;
	private static int tokenizer(String current_token){
		int token_number;
		switch (current_token) {
			case "kwdprog":
				token_number = -1;
				//System.out.println("kwdprog");
				break;
			case "{":
				token_number = -2;
				break;
			case "}":
				token_number = -3;
				break;
			case "kwdvars":
				token_number = -4;
				break;
			case "eps":	
				token_number = -5;
				break;
			case "(":
				token_number = -6;
				break;
			case ")":
				token_number = -7;
				break;
			case ";":
				token_number = -8;
				break;
			case "int":
				token_number = -9;
				break;	
			case "float":
				token_number = -10;
				break;	
			case "string":
				token_number = -11;
				break;	
			case "id":
				token_number = -12;
				break;	
			case "=":
				token_number = -13;
				break;	
			case "kprint":
				token_number = -14;
				break;	
			case "kwdwhile":
				token_number = -15;
				break;	
			case ",":
				token_number = -16;
				break;	
			case "==":
				token_number = -17;
				break;	
			case "!=":
				token_number = -18;
				break;	
			case "<=":
				token_number = -19;
				break;	
			case ">=":
				token_number = -20;
				break;	
			case "<":
				token_number = -21;
				break;	
			case ">":
				token_number = -22;
				break;
			case "+":
				token_number = -23;
				break;
			case "-":
				token_number = -24;
				break;
			case "*":
				token_number = -25;
				break;
			case "/":
				token_number = -26;
				break;
			case "^":
				token_number = -27;
				break;
			case "$":
				token_number = -28;
				break;
			default:
				token_number = -29;
				//System.out.println("non terminal");
				break;
		}
		return token_number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "kwdprog { kwdvars ( int ) }";
		Scanner kb = new Scanner(test);

		s.push(1);
		String current_token = "";
		current_token = kb.next();	
		kill = 0;

		while (kb.hasNext() && kill == 0) {
			//current_token = kb.next();			
			token_number = tokenizer(current_token);
			
			System.out.println("-------------------------------");
			for (int i =0; i < s.size(); i++){
				System.out.print(s.get(i) + " ");
			}
			System.out.println("");
			System.out.println("token: " + current_token + ", number: " + token_number );
			
			//Stack and it's manipulation
			stacktop = s.peek();
			if (stacktop > 0) {
				eval();
			} 
			else 
			{
				//Match
	            System.out.println("Match and pop " + current_token);
	            s.pop();
	            current_token = kb.next();
	        }
		}	
	}

	private static void eval() {
		// TODO Auto-generated method stub
		System.out.println("Eval .... ");
		int table_entry = ParseTable.lookUp(stacktop, Math.abs(token_number));	
		System.out.println("number: " + token_number + " -> returns: " + table_entry);
		switch (table_entry) {
			case 1:	//Pgm = kwdprog BBlock
				s.pop();
				s.push(2);
				s.push(-1);
				break;
			case 2: //BBlock = brace1 Vargroup Stmts brace2
				s.pop();
				s.push(-3);
				s.push(9);
				s.push(3);
				s.push(-2);
				break;
			case 3: //Vargroup = kwdvars PPvarlist
				s.pop();
				s.push(4);
				s.push(-4);
				break;
			case 4:	//Vargroup = eps
				s.pop();
				s.push(-5);
				break;
			case 5: //PPvarlist = parens1 Varlist parens2
				s.pop();
				s.push(-7);
				s.push(5);
				s.push(-8);
				break;
			case 6: //Varlist = Vardecl semi Varlist
				s.pop();
				s.push(5);
				s.push(-8);
				s.push(6);
				break;
			case 7: //Varlist = eps
				s.pop();
				s.push(-5);
				break;
			case 8: //Vardecl = Basekind Varid
				s.pop();
				s.push(8);
				s.push(7);
				break;
			case 9: //Basekind = int
				s.pop();
				s.push(-9);
				break;
			case 10: //Basekind = float
				s.pop();
				s.push(-10);
				break;
			case 11: //Basekind = string
				s.pop();
				s.push(-11);
				break;
			case 12: //Varid = id
				s.pop();
				s.push(-12);
				break;
			case 13: //Stmts = Stmt semi Stmts
				s.pop();
				s.push(9);
				s.push(-8);
				s.push(10);
				break;
			case 14: //Stmts = eps
				s.pop();
				s.push(-5);
				break;
			case 15: //Stmt = Stasgn
				s.pop();
				s.push(11);
				break;
			case 16: //Stmt = Stprint
				s.pop();
				s.push(12);
				break;
			case 17: //Stmt = Stwhile
				s.pop();
				s.push(13);
				break;
			case 18: //Stasgn = Varid equal Expr
				s.pop();
				s.push(19);
				s.push(-13);
				s.push(8);
				break;
			case 19: //Stprint = kprint PPexprs
				s.pop();
				s.push(14);
				s.push(-14);
				break;
			case 20: // Stwhile = kwdwhile PPexpr1 BBlock
				s.pop();
				s.push(2);
				s.push(15);
				s.push(-15);
				break;
			case 21: // PPexprs = parens1 Exprlist parens2
				s.pop();
				s.push(-7);
				s.push(16);
				s.push(-6);
				break;
			case 22: // PPexpr1 = parens1 Expr parens2
				s.pop();
				s.push(-7);
				s.push(19);
				s.push(-6);
				break;
			case 23: // Exprlist = Expr Moreexprs
				s.pop();
				s.push(17);
				s.push(19);
				break; 
			case 24:// Moreexprs = comma Exprlist
				s.pop();
				s.push(16);
				s.push(-16);
				break;
			case 25: // Moreexprs = eps
				s.pop();
				s.push(-5);
				break;
			case 26: // Expr' = Oprel Rterm Expr'
				s.pop();
				s.push(18);
				s.push(21);
				s.push(25);
				break;
			case 27: // Expr = Rterm
				s.pop();
				s.push(21);
				break;
			case 28: // Rterm' = Opadd Term Rterm'
				s.pop();
				s.push(20);
				s.push(23);
				s.push(28);
				break;
			case 29: // Rterm = Term
				s.pop();
				s.push(23);
				break;
			case 30:// Term' = Opmul Fact Term'
				s.pop();
				s.push(22);
				s.push(24);
				s.push(29);
				break;
			case 31: // Term = Fact
				s.pop();
				s.push(24);
				break;
			case 32: //Fact = int
				s.pop();
				s.push(-9);
				break;
			case 33: // Fact = float
				s.pop();
				s.push(-10);
				break;
			case 34: //Fact = string
				s.pop();
				s.push(-11);
				break;
			case 35: // Fact = Varid
				s.pop();
				s.push(8);
				break;
			case 36: // Fact = PPexpr1
				s.pop();
				s.push(15);
				break;
			case 37: // Oprel = opeq
				s.pop();
				s.push(-17);
				break;
			case 38: // Oprel = opne
				s.pop();
				s.push(-18);
				break;
			case 39: // Oprel = Lthan
				s.pop();
				s.push(26);
				break;
			case 40:// Oprel = ople
				s.pop();
				s.push(-19);
				break;
			case 41: // Oprel = opge
				s.pop();
				s.push(-20);
				break;
			case 42: // Oprel = Gthan
				s.pop();
				s.push(27);
				break;
			case 43: // Lthan = angle1
				s.pop();
				s.push(-21);
				break;
			case 44: // Gthan = angle2
				s.pop();
				s.push(-22);
				break;
			case 45: // Opadd = plus
				s.pop();
				s.push(-23);
				break;
			case 46: // Opadd = minus
				s.pop();
				s.push(-24);
				break;
			case 47: // Opmul = aster
				s.pop();
				s.push(-25);
				break;
			case 48: //Opmul = slash
				s.pop();
				s.push(-26);
				break;
			case 49: // Opmul = caret
				s.pop();
				s.push(-27);
				break;
			case 50: // POP error
				System.out.println("Pop Error");
				kill =1;
				break;
			case 51: // SCAN error
				System.out.println("Scan Error");
				kill =1;
				break;
			default:
				System.out.println("Error");
				kill =1;
				break;
	}
	}
	
	}