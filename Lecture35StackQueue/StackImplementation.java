package Lecture35StackQueue;

public class StackImplementation {

	public static void main(String[] args) throws Exception {
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.display();
		
		stack.pop();
		
		stack.display();
		
		stack.push(6);
		stack.push(7);

	}
}
