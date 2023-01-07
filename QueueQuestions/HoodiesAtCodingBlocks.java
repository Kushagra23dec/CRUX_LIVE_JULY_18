package QueueQuestions;

import java.util.*;

public class HoodiesAtCodingBlocks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		TreeMap<Integer, Queue<Integer>> map = new TreeMap<>();
		while (t-- > 0) {

			char ch = sc.next().charAt(0);
			if (ch == 'E' || ch == 'e') {
				int x = sc.nextInt();
				int y = sc.nextInt();
				if (map.containsKey(x)) {

					Queue<Integer> q = map.get(x);

					q.add(y);

				} else {
					Queue<Integer> q = new LinkedList<>();
					q.add(y);
					map.put(x, q);

				}

			} else if (ch == 'D' || ch == 'd') {
				if (!map.isEmpty() && !map.get(map.firstKey()).isEmpty()) {

					int x = map.firstKey();
					System.out.println(x + " " + map.get(x).poll());

				}
			}

		}

	}

}
