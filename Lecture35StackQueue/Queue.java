package Lecture35StackQueue;

public class Queue {

	private int[] arr;
	private int front;
	private int size;

	public Queue() {
		this.arr = new int[5];
		this.front = 0;
		this.size = 0;
	}

	public Queue(int val) {
		this.arr = new int[val];
		this.front = 0;
		this.size = 0;
	}

	// ENQUEUE
	public void enQueue(int val)throws Exception {
		if(size==arr.length) {
			throw new Exception("Queue is full");
		}
		int idx = (front+size) % arr.length;
		arr[idx] = val;
		size++;
		
	}

	// DEQUEUE
	public int deQueue()throws Exception {
		if(size==0) {
			throw new Exception("Queue is empty");
		}
		int val = arr[front];
		front = (front+1) % arr.length;
		size--;

		return val;
	}

	// DISPLAY
	public void display() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}

		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}

	public boolean isEmpty() {

		return size==0;
	}

}
