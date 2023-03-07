package HeapAssignment;

import java.util.*;

public class HostelVisit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		int q = sc.nextInt();
		int k = sc.nextInt();
		int query = 0;
		int x = 0, y = 0;

		// for first time..

		// take 1 and x and y three times.
//		for (int j = 0; j < k; j++) {
//			query = sc.nextInt();
//			x = sc.nextInt();
//			y = sc.nextInt();
//
//			int t = (x * x) + (y * y);
//
//			if (!pq.isEmpty() && pq.peek() > t) {
//				if (pq.size() <= k - 1) {
//					pq.add(t);
//				} else {
//					pq.poll();
//					pq.add(t);
//				}
//
//			} else if (pq.isEmpty()) {
//				pq.add(t);
//			}
//
//		}

		// take 2 as input
//		query = sc.nextInt();
		// now print 1st ans.

//		System.out.println(pq.peek());

		// now for remaning

		for (int i = 0; i < q; i++) {

			// now remaining

			query = sc.nextInt();
			if (query == 1) {
				x = sc.nextInt();
				y = sc.nextInt();
				int t = (x * x) + (y * y);

				if (!pq.isEmpty() && pq.peek() > t) {
					if (pq.size() <= k - 1) {
						pq.add(t);
					} else {
						pq.poll();
						pq.add(t);
					}

				} else if (pq.isEmpty()) {
					pq.add(t);
				}

			} else {

				System.out.println(pq.peek());

			}

		}

	}

}
