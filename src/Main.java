import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "kwdprog { 7 }";
		Scanner kb = new Scanner(test);
		String x = "";
		
//		ParseTable pt = new ParseTable();
//		while (kb.hasNext()){
//			x = kb.next();
//			if (x.equals("-1")){
//				break;
//			}
//			System.out.println(x);
		
		
		int token_number;
		//terminal tokens
		String current_token = "";
		//current_token = kb.next();
		while (kb.hasNext()) {
			current_token = kb.next();			//testing 
			switch (current_token) {
				case "kwdprog":
					token_number = -1;
					System.out.println("kwdprog");
					
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
					System.out.println("{");
					break;	
				case "}":
					token_number = -12;
					System.out.println("}");
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
					System.out.println("non terminal");
					break;
			}
		
	/*	
		//To Do
		//get the value up from parsetable
		Stack<Integer> s = new Stack<>();
		s.pop(1);	//so it runs the first time
		stacktop = s.peek();
		if (stacktop > 0) {
			table_entry = ParseTable(stacktop, abs(token_number));	
			switch (table_entry) {
				case 1:	
					//To DO
					//Pop and push for it
					break;		
				//To DO
				// Rest of the cases
		*/
		
		}
	}	
}
