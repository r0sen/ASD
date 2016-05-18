package task3;

import java.util.Arrays;

public class Stack {
	
	private int stack[]; 
	private int top;
	
	public Stack(int size){
		stack = new int [size];
		top = -1;
	}  
	
	private void stretch(){
		int capacity = stack.length + 5;
		stack = Arrays.copyOf(stack, capacity);
	}
	
	public void push(int value){
		if(top == stack.length-1)
			stretch();
		stack[top+1] = value;
		top++;
	}
	
	public int pop(){
		if(0 == top + 1)
			return 0;
		else{
			top--;
			return  stack[top+1];
			
		}
	}
	
	public int top(){
        if (top>=0)
        	return stack[top];
        else 
        	return 0;
	}
	
	public int count(){
		return top+1;	
	}
	
	public void printStack(){
		System.out.println("Your Stack:");
		for(int i = 0; i<=top; i++)
			System.out.print(stack[i] + " ");
	}

}
