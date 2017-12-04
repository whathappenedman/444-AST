import java.util.*;

public class Token {
	private int tokenId;		//ex) for "7", tokenId is 3
	private int lineNum;
	private String tokenName;	//ex) for "7", tokenName is 7
	private String type; 		//ex) for "7", tokenType is int
	
	public Token(int lineNum, int tokenId, String tokenName)
	{
		this.lineNum = lineNum;
		this.tokenId = tokenId;
		this.tokenName = tokenName;
		tokenIdtoName(tokenId);
	}

	public int getId()	{
		return tokenId;
	}
	public String getName()	{
		return tokenName;
	}
	public String getType(){
		return this.type;
	}
	public void tokenIdtoName (int id) {
		switch (tokenId) {
			case 2:
				type = "id";	
			case 3:
				type = "int";
			case 4:
				type = "float";
			case 5:
				type = "string";
			case 6:
				type = "comma";
			case 7:
				type = "semi";
			case 10:
				type = "kprog";
			case 11:
				type = "kmain";
			case 12:
				type = "kfcn";
			case 13:
				type = "kclass";
			case 15:
				type = "kfloat";
			case 16:
				type = "kint";
			case 17:
				type = "kstring";
			case 18:
				type = "kif";
			case 19:
				type = "kelseif";
			case 20:
				type = "kelse";
			case 21:
				type = "kwhile";
			case 22:
				type = "kinput";
			case 23:
				type = "kprint";
			case 24:
				type = "knew";
			case 25:
				type = "kreturn";
			case 26:
				type = "kvars";
			case 31:
				type = "angle1";
			case 32:
				type = "angle2";
			case 33:
				type = "brace1";
			case 34:
				type = "brace2";
			case 35:
				type = "bracket1";
			case 36:
				type = "bracket2";
			case 37:
				type = "parens1";
			case 38:
				type = "parens2";
			case 41:
				type = "aster";
			case 42:
				type = "caret";
			case 43:
				type = "colon";
			case 44:
				type = "dot";
			case 45:
				type = "equal";
			case 46:
				type = "minus";
			case 47:
				type = "plus";
			case 48:
				type = "slash";
			case 49:
				type = "oparrow";
			case 51:
				type = "opeq";
			case 52:
				type = "opne";
			case 53:
				type = "ople";
			case 54:
				type = "opge";
			case 55:
				type = "opshl";
			case 57:
				type = "opleopshr";
			case 99:
				type = "error";
			case 0:
				type = "END";
			default:
				type = "NONE";
				System.out.println("Error");
		}
				
	}
		
	@Override
	public String toString() {
        if (tokenId == 2) {
            return "(Tok: " + tokenId + " line= " + lineNum + " str= \"" + tokenName + "\" int= " + tokenName + ")";
        }
        if (tokenId == 3) {
            return "(Tok: " + tokenId + " line= " + lineNum + " str= \"" + tokenName + "\" float= " + tokenName + ")";
        }
        return "(Tok: " + tokenId + " line= " + lineNum + " str= \"" + tokenName + "\")";
	}
		



	
		




}
