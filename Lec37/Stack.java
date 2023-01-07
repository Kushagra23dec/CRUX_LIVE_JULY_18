package Lec37;

public class Stack {

	protected int top;
	protected int[] stack;

	public Stack() {
		stack = new int[5];
		top = -1;
	}

	public Stack(int n) {
		stack = new int[n];
		top = -1;
	}

	// PUSH
	public void push(int item) throws Exception {
		if (top >= stack.length - 1) {
			throw new Exception("Stack is Full !!");
		}
		top++;
		stack[top] = item;

	}

	// POP
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty !!");
		}

		int item = stack[top];
		top--;
		return item;
	}

	// PEEK
	public int peek() throws Exception {
		if (top == -1) {
			throw new Exception("Stack is Empty !!");
		}
		return stack[top];

	}

	// DISPLAY

	public void Display() throws Exception {
		if (top == -1) {
			throw new Exception("Stack is Empty !!");
		}

		for (int i = 0; i <= top; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}

	// isEmpty
	public boolean isEmpty() {
		return top == -1;
	}

	// isFull
	public boolean isFull() {
		return top == stack.length-1;
	}

	// size
	public int size() {

		return top + 1;
	}

}
