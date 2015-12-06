package kr.ac.kookmin.stack.lab;

public class Stackk {
	
	private int top;
	private Object[] stack;
	
	public Stackk(int _size) {
		top = 0;
		stack = new Object[_size];
	}
	
	public void push(Object obj) {
		if(top >= space()) {
			System.out.println("Stack Push " + obj + " >> ERROR: Stack is fulled");
			return ;
		} else {
			stack[top] = obj;			
			top = top + 1;
			
			System.out.println("Stack Pushed: " + obj);
			System.out.println(this.toString());
		}
	}
	
	public Object pop() {
		if(top == 0) {
			System.out.println("Stack Pop >> ERROR: Stack is empty");
			return null;
		} else {
			top = top - 1;			
			Object obj = new Object();
			obj = stack[top];
			stack[top] = null;
			
			System.out.println("Stack Poped: " + obj);
			System.out.println(this.toString());			
			return obj;
		}
	}
	
	public int size() {
		return top;
	}
	
	public int space() {
		return stack.length;
	}
	
	public boolean isEmpty() {
		return (top == 0)? true: false;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(int i=0 ; i < stack.length ; i++) {
			sb.append(" [" + stack[i] + "]");
		}
		return sb.toString();
	}
}

