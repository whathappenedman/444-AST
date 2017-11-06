	
public class ParseTable {
	public String[][] pt = new String[27][50];
	ParseTable(){
		pt[0][0] = "";
	}
}


public int ParseTable(int non_terminal, int token) {
        int parse_table[][] = {

			[
			//[0,"kwdprog","brace1","brace2","kwdvars","eps","parens1","parens2","semi","int","float","string","id","equal","kprint","kwdwhile","comma","opeq","opne","ople","opge","angle1","angle2","plus","minus","aster","slash","caret","$"],
			 [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],
			 [0,1,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,50],
			 [0,51,2,51,51,51,51,51,50,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,50],
			 [0,51,51,51,3,4,51,51,51,51,51,51,50,51,50,50,51,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,51,51,51,50,5,51,51,51,51,51,50,51,50,50,51,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,51,51,51,7,51,50,51,6,6,6,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,51,51,51,51,51,51,50,8,8,8,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,51,51,51,51,51,51,51,9,10,11,50,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,51,51,51,50,51,50,50,51,51,51,12,50,51,51,50,50,50,50,50,50,50,50,50,50,50,50,51],
			 [0,51,51,50,51,14,51,51,51,51,51,51,13,51,13,13,51,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,51,51,51,51,51,51,50,51,51,51,15,51,16,17,51,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,51,51,51,51,51,51,50,51,51,51,18,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,51,51,51,51,51,51,50,51,51,51,51,51,19,51,51,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,51,51,51,51,51,51,50,51,51,51,51,51,51,20,51,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,51,51,51,51,21,51,50,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,50,51,51,50,22,50,50,51,51,51,51,51,51,51,50,50,50,50,50,50,50,50,50,50,50,50,51],
			 [0,51,51,51,51,51,23,50,51,23,23,23,23,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,51,51,51,25,51,50,51,51,51,51,51,51,51,51,24,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,26,26,26,26,26,26,51,51,51,51,51,51],
			 [0,51,51,51,51,50,27,50,50,27,27,27,27,51,51,51,50,51,51,51,51,51,51,51,51,51,51,51,51],
			 [0,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,28,28,51,51,51,51],
			 [0,51,51,51,51,50,29,50,50,29,29,29,29,51,51,51,50,50,50,50,50,50,50,51,51,51,51,51,51],
			 [0,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,51,30,30,30,51],
			 [0,51,51,51,51,50,31,50,50,31,31,31,31,51,51,51,50,50,50,50,50,50,50,50,50,51,51,51,51],
			 [0,51,51,51,51,50,36,50,50,32,33,34,35,51,51,51,50,50,50,50,50,50,50,50,50,50,50,50,51],
			 [0,51,51,51,51,51,50,51,51,50,50,50,50,51,51,51,51,37,38,40,41,39,42,51,51,51,51,51,51],
			 [0,51,51,51,51,51,50,51,51,50,50,50,50,51,51,51,51,51,51,51,51,43,51,51,51,51,51,51,51],
			 [0,51,51,51,51,51,50,51,51,50,50,50,50,51,51,51,51,51,51,51,51,51,44,51,51,51,51,51,51],
			 [0,51,51,51,51,51,50,51,51,50,50,50,50,51,51,51,51,51,51,51,51,51,51,45,46,51,51,51,51],
			 [0,51,51,51,51,51,50,51,51,50,50,50,50,51,51,51,51,51,51,51,51,51,51,51,51,47,48,49,51]] 
				
				
				
				
				
				
				
				
				
				
        };

        return parse_table[non_terminal][token];
}