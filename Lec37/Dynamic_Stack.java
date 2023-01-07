package Lec37;

public class Dynamic_Stack extends Stack {

	@Override
	public void push(int item) throws Exception {

		if (this.isFull()) {
			int size = 2 * stack.length;
			int[] arr = new int[size];
			for (int i = 0; i < size(); i++) {
				arr[i] = stack[i];
			}
			stack = arr;

		}

		super.push(item);

	}
}
