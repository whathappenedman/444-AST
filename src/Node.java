import java.util.*;

public class Node {
	
	private Symbol symbol;
	private boolean isTerminal;
	ArrayList<Node> children = new ArrayList<Node>();		

	public Node (Symbol s, boolean terminal)
	{
		symbol = s;
		isTerminal = terminal;	
	}
	public Node (boolean terminal)
	{
		isTerminal = terminal;
	}	
	public void addChild(Node node)
	{
		this.children.add(node);
	}
	public Symbol getSymbol()
	{
		return symbol;
	}
	public Node getChild(int num)
	{
		return children.get(num);
	}
	public boolean getIsTerminal()
	{
		return isTerminal;
	}

}
