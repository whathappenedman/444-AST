public class Node {

	public Node parentNode;
	public Node leftChildNode;
	public Node rightChildNode;
	public int id;
	public String name;
	public String value;
		
	public Node (Node ParentNode)
	{
		this.parentNode = ParentNode	
	}
	public Node (Node ParentNode, String nodeName)
	{
		this.parentNode = ParentNode;
		this.name = nodeName;	
	}
	public Node (Node ParentNode, String nodeName, String nodeValue)
	{
		this.parentNode = ParentNode;
		this.name = nodeName;
		this.value = nodeValue;		
	}	
	public void setLeftChild(Node node)
	{
		this.leftChildNode = node;
	}
	public void setRightChild(Node node)
	{
		this.rightChildNode = node;	
	}
	public Node getParent()
	{
		return parentNode;
	}
	public Node getLeftChild()
	{
		return leftChildNode;
	}
	public Node getRightChild()
	{
		return rightChildNode;	
	}
}
