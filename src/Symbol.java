import java.util.*;

public class Symbol {
	
	private int id;
	private String name;
 	private boolean isTerminal;
	private Token token;
	
	public Symbol(int id, String name, boolean isTerminal) {
		this.id = id;
		this.name = name;
      		this.isTerminal = isTerminal;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIsTerminal(boolean isTerminal) {
		this.isTerminal = isTerminal;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getIsTerminal() {
		return isTerminal;
	}

	public Token getToken() {
		return token;
	}
}
