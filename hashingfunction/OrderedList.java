package hashingfunction;

public class OrderedList {
	Node start;

	public void addItem(int data) {
		Node head = start;
		Node temp = new Node();
		temp.data = data;
		temp.nextNode = null;
		if (start == null) {
			start = temp;
		} else {
			while (head.nextNode != null) {
				head = head.nextNode;
			}
			head.nextNode = temp;
		}
	}

	public void display() {
		Node temp = start;
		while (temp != null) {
			System.out.print(temp.data + "---->");
			temp = temp.nextNode;
		}
		System.out.println(" ");
	}
}
