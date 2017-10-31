
public class ParseTable {
	public String[][] pt = new String[27][50];
	ParseTable(){
		pt[0][0] = "";
	}
}


public int ParseTable(int non_terminal, int token) {
        int parse_table[][] = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 98, 98, 1, 98, 1, 99, 99, 1, 98},
            {0, 2, 3, 98, 98, 98, 4, 98, 98, 4},
            {0, 5, 99, 98, 98, 5, 99, 99, 5, 98},
            {0, 8, 8, 6, 7, 98, 8, 98, 98, 8},
            {0, 9, 99, 99, 99, 9, 99, 99, 9, 98},
            {0, 11, 11, 11, 11, 98, 11, 10, 98, 11},
            {0, 99, 99, 99, 99, 12, 99, 99, 13, 99}
        };

        return parse_table[non_terminal][token];
}