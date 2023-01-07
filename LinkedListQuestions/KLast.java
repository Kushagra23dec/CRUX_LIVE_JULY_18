package LinkedListQuestions;

import java.util.*;

public class KLast {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			if (x == -1) {
				break;
			}
			ll.addLast(x);
		}

		int k = sc.nextInt();
		int e = 0;
		while (!ll.isEmpty() && k-- > 0) {
			e = ll.removeLast();
		}

		System.out.println(e);
	}
}