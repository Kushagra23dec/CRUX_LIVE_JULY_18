package Lecture35StackQueue;

public class QueueImplementation {

	public static void main(String[] args)throws Exception {
		
		Queue q = new Queue();
		
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		
		q.display();
		
		q.deQueue();
		
		q.display();
		q.enQueue(8);
		q.display();
	}
}
