package Graph;

import java.util.*;

public class DSU {

	public class Node {
		int val;
		int rank;
		Node parent;
	}

	HashMap<Integer, Node> map = new HashMap<>();

	// create Set
	public void createSet(int v) {
		Node nn = new Node();
		nn.val = v;
		nn.rank = 0;
		nn.parent = nn;
		map.put(v, nn);
	}

	// find value
	public int find(int v) {
		Node nn = map.get(v);
		return find(nn).val;
	}

	private Node find(Node nn) {
		if (nn.parent == nn) {
			return nn;
		}

		return find(nn.parent);
	}

	// union

	public void union(int v1, int v2) {
		Node n1 = map.get(v1);
		Node n2 = map.get(v2);
		Node re1 = find(n1); // representative element of n1
		Node re2 = find(n2); // representative element of n2

		if (re1.rank == re2.rank) {
			re1.parent = re2;
			re2.rank++;
		} else if (re1.rank > re2.rank) {
			re2.parent = re1;

		} else {
			re1.parent = re2;
		}
	}

}
