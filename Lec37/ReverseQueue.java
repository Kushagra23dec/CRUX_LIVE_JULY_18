package Lec37;

import Lecture35StackQueue.Queue;

public class ReverseQueue {

	public static void main(String[] args) throws Exception {
		Queue qu = new Queue(10);

		qu.enQueue(10);
		qu.enQueue(20);
		qu.enQueue(30);
		qu.enQueue(40);
		qu.enQueue(50);
		qu.enQueue(60);

		qu.display();

		reverse(qu);

		qu.display();

	}

	public static void reverse(Queue qu) throws Exception {
		if (qu.isEmpty()) {
			return;
		}

		int item = qu.deQueue();
		reverse(qu);
		qu.enQueue(item);
	}

}
