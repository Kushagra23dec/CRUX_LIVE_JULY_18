package Lec57;

import java.util.*;

public class DijkstraAlgorithm {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public DijkstraAlgorithm(int v) {
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

	}

	public void DijkstraAlgo(int src, int totalVertices) {
		
		HashMap<Integer, Integer> minCostMap = new HashMap<>();

		for (int i = 1; i <= totalVertices; i++) {
			minCostMap.put(i, -1);
		}

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
			
//			System.out.println(rp);
			
			if (rp.vtx != src) {
//				System.out.print(rp.cost + " ");
				minCostMap.put(rp.vtx, rp.cost);
			 
			}
			
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = rp.cost + map.get(rp.vtx).get(nbrs);
					DijktraPair dp = new DijktraPair(nbrs, rp.acqp + nbrs, cost);
					pq.add(dp);
				}
			}
			
		}
		
		for (int i = 1; i <= totalVertices; i++) {
			if(i != src){
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