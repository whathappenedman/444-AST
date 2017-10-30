import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "kwdprog { 7 }";
		Scanner kb = new Scanner(test);
		String x = "";
		
		ParseTable pt = new ParseTable();
		while (kb.hasNext()){
			x = kb.next();
			if (x.equals("-1")){
				break;
			}
			System.out.println(x);
		}
	}

}
