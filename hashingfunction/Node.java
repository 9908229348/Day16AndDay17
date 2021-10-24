package hashingfunction;

public class Node {
	public int data;
	public Node nextNode;

	public Node() {
		this.nextNode = null;
	}

	public void setData(int data) {
		this.data = data;
		nextNode = null;
	}
}
