import java.util.*;

public class Node {

	public Node parentNode = null;
	ArrayList children = new ArrayList();
	public int id;
	public String name;
	public String value;
		
	public Node (Node ParentNode)
	{
		this.parentNode = ParentNode;
	}
	public Node (Node ParentNode, String nodeName)
	{
		this.parentNode = ParentNode;
		this.name = nodeName;	
	}
	public Node (Node ParentNode, String nodeName, String nodeValue, int nodeId)
	{
		this.parentNode = ParentNode;
		this.name = nodeName;
		this.value = nodeValue;	
		this.id = nodeId;
	}	
	public void addChild(Node node)
	{
		this.children.add(node);
	}
	public Node getParent()
	{
		return parentNode;
	}
	public Node getChild(int num)
	{
		return children.get(num);
	}

}
