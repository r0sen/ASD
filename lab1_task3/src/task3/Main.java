package task3;

public class Main {
	public static void main(String[] args) {
		SLList list = new SLList();
		Stack stack = new Stack(6);
		list.output();

		stack.push(-10);
		stack.push(40);
		stack.push(30);
		stack.push(50);
		stack.push(60);
		stack.printStack();
		// int x = stack.top();
		for (int i = stack.count(); i >= 0; i--) {
			int intVal = stack.pop();
			if (intVal >= 0) {
				list.addFirst(Integer.toHexString(intVal));
			} else {
				list.addLast(Integer.toHexString(intVal * -(1)));
			}
		}

		list.output();
		stack.printStack();
		
	}
}
