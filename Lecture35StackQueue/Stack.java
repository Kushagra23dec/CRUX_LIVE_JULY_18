package Lecture35StackQueue;

public class Stack {

	private int[] arr;
	private int top;

	public Stack() {
		this.arr = new int[5];
		this.top = -1;
	}

	public Stack(int n) {
		this.arr = new int[n];
		this.top = -1;
	}

	// PUSH FUNCTION
	public void push(int a) throws Exception {
		if (top == arr.length - 1) {
			throw new Exception("Stack is full");
		}

		top++;
		arr[top] = a;
	}

	// POP FUNCTION
	public int pop() throws Exception {
		if (top == -1) {
			throw new Exception("Stack is Empty");
		}
		int var = arr[top];
		top--;

		return var;
	}

	// PEEK FUNCTION
	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		return arr[top];
	}

	// DISPLAY FUNCTION
	public void display() throws Exception {
		if (top == -1) {
			throw new Exception("Stack is Empty");
		}

		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// IS EMPTY
	public boolean isEmpty() {

		return top == -1;
	}

	// IS FULL
	public boolean isFull() {

		return top == arr.length;
	}

}
