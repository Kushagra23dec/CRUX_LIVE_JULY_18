package Graph;

import java.util.*;

public class Graph {
	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

	public Graph(int v) {

		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);

		map.get(v2).put(v1, cost);

	}

	// contains vertex
	public boolean containsVertex(int v) {
		return map.containsKey(v);
	}

	// contains edge
	public boolean containsEdge(int v1, int v2) {
		if (map.containsKey(v1) && map.containsKey(v2)) {
			return map.get(v1).containsKey(v2);
		}

		return false;
	}

	// no of edges
	public int noOfEdges() {
		int ans = 0;
		for (int key : map.keySet()) {
			ans += map.get(key).size();
		}

		return ans / 2;
	}

	// Remove edge
	public void removeEdge(int v1, int v2) {
		if (containsEdge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}
	}

	// Remove Vertex
	public void removeVertex(int v) {
		if (containsVertex(v)) {
			// first remove this vertex's edges with all other vertices.
			for (int key : map.get(v).keySet()) {
				map.get(key).remove(v);
			}
			// then finally remove this vertex form map.
			map.remove(v);
		}
	}

	// haspath
	public boolean haspath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true;
		}

		// mark currnet src vertex as visited
		visited.add(src);
		for (int key : map.get(src).keySet()) {
			if (!visited.contains(key)) {
				boolean ans = haspath(key, des, visited);
				if (ans) {
					return ans; // if this key reached to the des
				}
			}
		}

		// release the vertex if there is no path to des.
		visited.remove(src);

		return false;
	}

	public void display() {
		for (int key : map.keySet()) {

			System.out.println(key + "-->" + map.get(key));

		}
	}
	

	// BFS
	public boolean BFS(int src,int des) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while(!q.isEmpty()) {
			 // remove
			
			int rv = q.poll();
			
			// ignore
			if(visited.contains(rv)) {
				continue;
			}
			// mark visited
			visited.add(rv);
			// selfword
			if(rv == des) {
				return true;
			}
			// add unvisited neighbours
			for(int nbrs : map.get(rv).keySet()) {
				if(!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;
		 
	}
	
	
   // DFS
	
  public boolean DFS(int src,int des) {
	  
	  Stack<Integer> s = new Stack<>();
	  HashSet<Integer> visited = new HashSet<>();
	  s.push(src);
	  while(!s.isEmpty()) {
		  // remove
		  	int rv = s.pop();
		  // ignore if visited
		  if(visited.contains(rv)) {
			  continue;
		  }
		  // mark visited
		  visited.add(rv);
		  // self work (check if rv == des)
		  if(rv == des) {
			  return true;
		  }
		  // add unvisited nbrs
		  for(int nbrs : map.get(rv).keySet()) {
			  if(!visited.contains(nbrs)) {
				  s.push(nbrs);
			  }
		  }
	  }
	  
	  
	  return false;
  }
	
	
	
	
	
	

}
