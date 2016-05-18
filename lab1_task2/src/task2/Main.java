package task2;

//import java.util.*;

public class Main {
	public static void main(String[] args) {

		SLList list = new SLList();

		// list.addFirst(Integer.toHexString(1));
		list.addFirst(Integer.toHexString(2));
		list.addFirst("jhgj");
		
		list.output();

		list.addLast(Integer.toHexString(3));
		list.addLast(Integer.toHexString(4));
		
		list.output();
		
		list.removeFirst();
		
		list.output();

	}
}
