import java.util.*;

public class DijkstraAlgorithm {

	HashMap<Integer, HashMap<Integer, Integer>> graph;

	public DijkstraAlgorithm(int TotalVertices) {
		this.graph = new HashMap<>();
		for (int i = 1; i <= TotalVertices; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {

		if (graph.get(v1).get(v2) == null) {

			graph.get(v1).put(v2, cost);
			graph.get(v2).put(v1, cost);
		} 
		else if (graph.get(v1).get(v2) > cost) {
			graph.get(v1).put(v2, cost);
			graph.get(v2).put(v1, cost);
		}

		 
	}

	public class DijkstraPair {
		int vtx; // vertex
		int cost; // cost so far.
		String acqp; // accquired path.

		public DijkstraPair(int vtx, String acqp, int cost) {
			this.vtx = vtx;
			this.acqp = acqp;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.vtx + " -> " + this.acqp + " @ " + this.cost;
		}
	}

	public void DijkstraAlgo(int StartingPoint, int totalVertices) {
		HashMap<Integer, Integer> minCostMap = new HashMap<>();

		for (int i = 1; i <= totalVertices; i++) {
			minCostMap.put(i, -1);
		}

		String ans = "";
		int c = 0;
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraAlgorithm.DijkstraPair o1, DijkstraAlgorithm.DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}

		});

		HashSet<Integer> visited = new HashSet<>();

		pq.add(new DijkstraPair(StartingPoint, "" + StartingPoint, 0));

		while (!pq.isEmpty()) {
			// remove
			DijkstraPair rp = pq.poll();
			// ignore
			if (visited.contains(rp.vtx)) {
				continue;
			}

			// visited
			visited.add(rp.vtx);
			// selfwork

			if (rp.vtx != StartingPoint) {
//				System.out.print(rp.cost + " ");
				minCostMap.put(rp.vtx, rp.cost);
				c++;
			}

			// add nbrs
			for (int nbrs : graph.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = rp.cost + graph.get(rp.vtx).get(nbrs);
					DijkstraPair dp = new DijkstraPair(nbrs, rp.acqp + " " + nbrs, cost);
					pq.add(dp);
				}
			}

		}

//		if (c != totalVertices - 1) {
		for (int i = 1; i <= totalVertices; i++) {

			if (i != StartingPoint) {
				System.out.print(minCostMap.get(i) + " ");
			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			DijkstraAlgorithm dijk = new DijkstraAlgorithm(n);

			for (int i = 0; i < m; i++) {
				int v1 = sc.nextInt();
				int v2 = sc.nextInt();
				int cost = sc.nextInt();
				dijk.addEdge(v1, v2, cost);

			}
			int StartingPoint = sc.nextInt();
			dijk.DijkstraAlgo(StartingPoint, n);
			System.out.println();
		}

	}

}
