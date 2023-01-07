package Lec40;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();

		ll.addFirst(10);
		ll.addFirst(20);
		ll.addLast(5);
		ll.Display();

		ll.addFirst(30);
		ll.addFirst(40);
		ll.addLast(4);
		ll.Display();

		System.out.println(ll.GetSize());

		ll.InsertAtAny(2, 35);

		ll.Display();

		ll.DeleteFirst();

		ll.Display();

		ll.DeleteLast();
		System.out.println(ll.GetSize());

		ll.Display();
		System.out.println(ll.GetSize());

	}

}
