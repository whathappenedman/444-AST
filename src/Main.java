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
					s.pop()
					break;
				case 10: //Basekind = float
					s.pop()
					break;
				case 11: //Basekind = string
					s.pop()
					break;
				case 12: //Varid = id
					s.pop()
					break;

		}
	}	
}
