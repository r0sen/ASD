package task3;
public class SLList {
	private SLNode head;
	private SLNode tail;
	//private SLNode tail;
	private int size;
	SLList next;
	public SLList(){
		head = null;
		tail=null;
		size = 0;
	}
	public void addFirst(String value) {
		
		SLNode newNode = new SLNode(Integer.toHexString(Integer.parseInt(value, 16)).toString());
		if (size==0){
			tail = newNode;
		}
		if (size != 0) {
			newNode.next=head;
		}
		head = newNode;
		size++;
	}

	public void addLast(String value) {
		SLNode newNode = new SLNode(value);
		if (size == 0) {
		head = newNode;
		tail = newNode;
		} else {
		tail.next=newNode;	
		tail=newNode;
		size++;
		}
	}
	
	public void output() {
		SLNode curr;
		
			System.out.println("My list: ");
			if (head != null)
			{
				curr= head.next;
			
				while (curr != null) {
					System.out.println(curr.data + " ");
					curr = curr.next;
				}
			}
			else
				System.out.println("list is empty");
			}
			
	public void add(int index, String value) {

	if (index < 0 || index > size) {
		System.out.println("Invalid index: " + index);
	}
	if (index == 0) {
		addFirst(value);
		return;
	}
	if (index == size) {
		addLast(value);
		return;
	}
	SLNode curr = head;
	for (int i = 1; i < index; i++) {
		curr = curr.next;
	}
	SLNode newNode = new SLNode(value);
	newNode.next = curr.next;
	curr.next = newNode;
	size++;
}
	public String removeFirst() {
		if (size!=0) {
		String toRemove = head.data;
		head = head.next;
		size--;
		return toRemove;
		}
		return "";
	}
	
	public String remove(int index) {
		if (index < 0 || index >= size) {
		System.out.println("Invalid index: " + index);
		return "";
		}
		if (index == 0) {
			return removeFirst();
		}
		SLNode curr = head;
		for (int i = 1; i < index; i++) {
			curr = curr.next;
		}
		SLNode delNode = curr.next;
		curr.next = delNode.next;
		size--;
		return delNode.data;
	}
	
	public String removeLast() {
		SLNode curr = head;
		for (int i = 1; i < size-1; i++) {
			curr = curr.next;
		}
		SLNode delNode = curr.next;
		curr.next = null;
		size--;
		return delNode.data;
	}
}


































	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	