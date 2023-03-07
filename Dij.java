import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'shortestReach' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER n 2. 2D_INTEGER_ARRAY edges 3. INTEGER s
	 */

	HashMap<Integer, HashMap<Integer, Integer>> graph;

	public Result(int TotalVertices) {
		this.graph = new HashMap<>();
		for (int i = 1; i <= TotalVertices; i++) {
			graph.put(i, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		graph.get(v1).put(v2, cost);
		graph.get(v2).put(v1, cost);
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

	}

	public void DijkstraAlgo(int StartingPoint, int totalVertices, List<Integer> minCost) {
		HashMap<Integer, Integer> minCostMap = new HashMap<>();

		for (int i = 1; i <= totalVertices; i++) {
			minCostMap.put(i, -1);
		}

		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(Result.DijkstraPair o1, Result.DijkstraPair o2) {
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
//			System.out.print(minCostMap.get(i) + " ");
			if (i != StartingPoint) {
				minCost.add(minCostMap.get(i));
			}
		}

	}

	/*
	 */

	// treat it as main Function.
	public static List<Integer> shortestReach(int n, List<List<Integer>> edges, int s) {
		// Write your code here

		Result obj = new Result(n);

		for (List<Integer> t : edges) {
			// connecting edges
			int v1 = t.get(0);
			int v2 = t.get(1);
			int cost = t.get(2);

			obj.addEdge(v1, v2, cost);

		}

		List<Integer> ans = new ArrayList<>();
		obj.DijkstraAlgo(s, n, ans);

		return ans;
	}

	/*  
	 */

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				int n = Integer.parseInt(firstMultipleInput[0]);

				int m = Integer.parseInt(firstMultipleInput[1]);

				List<List<Integer>> edges = new ArrayList<>();

				IntStream.range(0, m).forEach(i -> {
					try {
						edges.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
								.map(Integer::parseInt).collect(toList()));
					} catch (IOException ex) {
						throw new RuntimeException(ex);
					}
				});

				int s = Integer.parseInt(bufferedReader.readLine().trim());

				List<Integer> result = Result.shortestReach(n, edges, s);

				bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}
}
