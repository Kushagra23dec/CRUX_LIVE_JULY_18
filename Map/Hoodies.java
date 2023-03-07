package Map;

import java.util.*;
import java.util.Map.Entry;

public class Hoodies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		LinkedHashMap<Integer, Queue<Integer>> map = new LinkedHashMap<>();
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
					map.put(x, new LinkedList<>(q));

				}

			} else if (ch == 'D' || ch == 'd') {

				Map.Entry<Integer, Queue<Integer>> firstkey = map.entrySet().iterator().next();

				int x = firstkey.getKey();

				System.out.println(x + " " + map.get(x).poll());

				if (map.get(x).size() == 0) {
					map.remove(x);
				}

			}

		}

	}
}