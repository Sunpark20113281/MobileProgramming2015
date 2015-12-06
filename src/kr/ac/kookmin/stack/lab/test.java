package kr.ac.kookmin.stack.lab;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackk stack = new Stackk(2);
		
		stack.push(10);
		stack.push(50);
		stack.pop();
		stack.push(7);
		stack.push(15);
		stack.push(20);		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.push(12);
	}

}
