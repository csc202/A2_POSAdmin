
public class ItemLinkedList {
	Node head, tail;
	int numElement;
	public ItemLinkedList() {
		head = null;
		tail = null;
		numElement=0;
	}
	
	public void insert(String element) {
		Node newNode = new Node(element);
		if(head==null) {
			head = newNode;
		} else {
			tail.setLink(newNode);
		}
		tail = newNode;
		numElement++;
	}
	
	//remove
	//isEmpty
	//find
	//toString
	public String toString() {
		String list="";
		Node current;
		current = head;
		while(current!=null) {
			list += current.getValue() + " ";
			current = current.getLink();
		}
		return list;
	}
}
