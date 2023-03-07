import java.util.*;

public class WordSearchTwo {

	class Node {
		char data;
		HashMap<Character, Node> children = new HashMap<>();
		boolean isTerminal = false;
		String completeWord = "";

	}

	private Node root;

	public WordSearchTwo() {
		Node nn = new Node();
		nn.data = '*';
		nn.completeWord = "";
		this.root = nn;
	}

	public void insert(String word) {
		Node node = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (node.children.containsKey(ch)) {
				node = node.children.get(ch); // if char is present then pass its reference
												// to node.
			} else {
				Node nn = new Node();
				nn.data = ch;
//				nn.completeWord += node.completeWord + ch;
				node.children.put(ch, nn);
				node = nn;

			}
		}
		node.isTerminal = true;
		node.completeWord = word;
	}

// Main function

	public static void main(String[] args) {
		char[][] board = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };
		String[] words = { "oath", "pea", "eat", "rain" };

		List<String> ans = findWords(board, words);

		System.out.println(ans);

	}

// Main Function Ends...

	public static List<String> findWords(char[][] board, String[] words) {

		List<String> ans = new ArrayList<>();

		WordSearchTwo obj = new WordSearchTwo();

		// to add all the words to the trie...
		for (String str : words) {
			obj.insert(str);
		}

		boolean[][] isVisited = new boolean[board.length][board[0].length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {

				Wordsearch(board, i, j, obj.root, 0, ans, isVisited);

			}
		}

		return ans;

	}

	public static void Wordsearch(char[][] board, int cr, int cc, Node root, int i, List<String> ansList,
			boolean[][] isVisited) {

		if (cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || root == null
				|| root.children.size() == 0) {

			return;
		}

		if (isVisited[cr][cc]) {
			return;
		}

		if (!root.children.containsKey(board[cr][cc])) {
			return;
		}

		int[] row = { -1, 1, 0, 0 };
		int[] col = { 0, 0, 1, -1 };

		// marked backtracking

		isVisited[cr][cc] = true;


		Node child = root.children.get(board[cr][cc]);
		if (child != null && child.isTerminal) {
			ansList.add(child.completeWord);
			child.isTerminal = false;
		}

		for (int itr = 0; itr < 4; itr++) {

			Wordsearch(board, cr + row[itr], cc + col[itr], child, i + 1, ansList, isVisited);

		}

		// release backtracking
		isVisited[cr][cc] = false;
	}

}