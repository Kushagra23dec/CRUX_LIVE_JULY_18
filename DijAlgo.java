
import java.util.*;

public class DijAlgo {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public DijAlgo(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void addEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
		map.get(v2).put(v1, cost);
	}

	public class DijktraPair {
		int vtx;
		String acqp;
		int cost;

		public DijktraPair(int vtx, String acqp, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.cost = cost;
			this.acqp = acqp;

		}

		@Override
		public String toString() {
			return this.vtx + " " + this.acqp + "  @ " + this.cost;
		}
	}

	public void DijktraAlgo(int src, int n, List<Integer> minCost) {

		PriorityQueue<DijktraPair> pq = new PriorityQueue<>(new Comparator<DijktraPair>() {

			@Override
			public int compare(DijktraPair o1, DijktraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;//
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijktraPair(src, "" + src, 0));
		while (!pq.isEmpty()) {
			DijktraPair rp = pq.remove();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = rp.cost + map.get(rp.vtx).get(nbrs);
					DijktraPair dp = new DijktraPair(nbrs, rp.acqp + nbrs, cost);
					pq.add(dp);
				}
			}
		}

	}

	/*
	 */

	// treat it as main Function.
	public static List<Integer> shortestReach(int n, List<List<Integer>> edges, int s) {
		// Write your code here

		DijAlgo obj = new DijAlgo(n);

		for (List<Integer> t : edges) {
			// connecting edges
			int v1 = t.get(0);
			int v2 = t.get(1);
			int cost = t.get(2);

			obj.addEdge(v1, v2, cost);

		}

		List<Integer> ans = new ArrayList<>();
		obj.DijktraAlgo(s, n, ans);

		return ans;
	}

	/*  
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			DijAlgo dijk = new DijAlgo(n);

			List<List<Integer>> edges = new ArrayList<>();

			List<Integer> temp = new ArrayList<>();

			for (int i = 0; i < m; i++) {
				int v1 = sc.nextInt();
				int v2 = sc.nextInt();
				int cost = sc.nextInt();
				temp.add(v1);
				temp.add(v2);
				temp.add(cost);

				edges.add(new ArrayList<>(temp));
				temp.clear();

			}

			int StartingPoint = sc.nextInt();

			List<Integer> ans = shortestReach(n, edges, StartingPoint);

//			dijk.DijkstraAlgo(StartingPoint, n);
			System.out.println(ans.toString());
		}

	}

}
