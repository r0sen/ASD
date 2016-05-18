package task2;



public class SLList {

	private SLNode head;
	private SLNode tail;
	// private SLNode tail;
	private int size;

	// SLList next;
	public SLList() {
		head = null;
		tail = null;
		size = 0;
	}

	public boolean check(String data) {
		for (int i = 0; i <= data.length() - 1; i++) {
			if (!(((data.charAt(i) <= 'f') && (data.charAt(i) >= 'a'))
					|| ((data.charAt(i) <= '9') && (data.charAt(i) >= '0'))))
				return false;
		}
		return true;
	}

	public void addFirst(String value) {

		if (check(value) == true) {
			SLNode newNode = new SLNode(Integer.toHexString(Integer.parseInt(value)).toString());
			if (size == 0) {
				tail = newNode;
			}
			if (size != 0) {
				newNode.next = head;
			}
			head = newNode;
			size++;
		} else
			System.out.println("NOT HEX!!!");
	}

	public void addLast(String value) {

		if (check(value) == true) {
			SLNode newNode = new SLNode(value);
			if (size == 0) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
				size++;
			}
		} else
			System.out.println("NOT HEX!!!");

	}

	public void output() {
		System.out.println("My list: ");
		SLNode curr = head;
		while (curr != null) {
			System.out.println(curr.data + " ");
			curr = curr.next;
		}
	}

	public void add(int index, String value) {

		if (check(value) == true) {
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
		} else
			System.out.println("NOT HEX!!!");
	}

	public String removeFirst() {
		if (size != 0) {
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
		delNode = null;
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
