package HeapAssignment;

import java.util.*;

public class FindkthLargestNumber {

	public static void main(String[] args) {
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(); // now it is maxHeap...

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// solution..
		int i = 0;

		for (; i < k; i++) {
			heap.add(arr[i]);
		}

		while (i < n) {

			if (heap.peek() < arr[i]) {
				heap.poll();
				heap.add(arr[i]);
				i++;
			} else {
				i++;
			}

		}

		System.out.println(heap.peek());

	}

}
