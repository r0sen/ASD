package task1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean x = true;
		int value;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input size of stack:");
		int size = sc.nextInt();
		Stack stack = new Stack(size);		
		//stack.createStack(size);
		while(x){
			stack.printStack();
			System.out.println("\nPrint your command(push, pop, top, exit):");
			str = sc.next();
			if(str.equals("push")){
				//System.out.println("top = "+ stack.top());
				System.out.println("Input number, what to push in stack:");
				value = sc.nextInt();
				stack.push(value);
				//System.out.println("top = "+ stack.top());
			} else if(str.equals("pop")){
				if(stack.top()==0)
					System.out.println("Stack is empty, use \"push\" command");
			else
					//System.out.println("top = "+ stack.top());
					System.out.println("poped "+ stack.pop());
					//System.out.println("top = "+ stack.top());
				
			} else if(str.equals("top"))
				stack.top();
			else if(str.equals("exit"))
				x = false;
			else 
				System.out.println(str + "\tWrong command");
		}
		sc.close();
	}

}
