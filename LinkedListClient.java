import java.util.*;
public class LinkedListClient {
	
//	9
//	9 4 1 7 8 3 2 6 5

	public static void main(String[] args) throws Exception {
		 LinkedList ll = new LinkedList();
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 
		 for(int i = 0; i<n; i++) {
			 ll.addLast(sc.nextInt());
		 }
		 
		 ll.Display();
		 
		 
		 ll.DeleteNodesLL();
		 
		 ll.Display();
		 

	}

}
