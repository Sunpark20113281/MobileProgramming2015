package kr.ac.kookmin.generic.stack;

import java.util.LinkedList;

class Stack<T>{
	
	public LinkedList<T> stack = new LinkedList<T>();
	
	public T pop() {
		if (stack == null){
			System.out.println("Stack Pop >> ERROR: Stack is empty");
			return null;
		}
		else {
			T obj;
			obj = stack.pop(); 
		
			System.out.println("Stack Poped: " + obj);
			System.out.println(stack);
			return obj;
		}	
	}
	
	public void push(T data) {
		stack.add(data);
		System.out.println("Stack Pushed: " + data);
		System.out.println(stack);
	}
}

public class StackGeneric {
	public static void main(String arg[]){
		Stack<Integer> stackInteger = new Stack<Integer>();	
		stackInteger.push(1);
		stackInteger.push(2);
		System.out.println(stackInteger.pop());
		System.out.println(stackInteger.pop());
		
		Stack<String> stackString = new Stack<String>();	
		stackString.push("Kookmin University");
		stackString.push("Korea Seoul");
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}
}