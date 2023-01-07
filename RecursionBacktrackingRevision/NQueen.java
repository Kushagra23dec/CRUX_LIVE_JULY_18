package RecursionBacktrackingRevision;

import java.util.*;

public class NQueen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] board = new boolean[n][n];
		List<List<String>> ans = new ArrayList<>();
		List<String> temp = new ArrayList<>();

		nQueen(board, 0, 0, n, ans, temp);
		System.out.println(ans);

	}

	public static void nQueen(boolean[][] board, int row, int col, int tq, List<List<String>> ans, List<String> temp) {

		if (tq == 0) {
			Display(board, ans, temp);

			return;
		}

		for (col = 0; col < board.length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;

				nQueen(board, row + 1, col, tq - 1, ans, temp);

				board[row][col] = false;
			}
		}

	}

	private static boolean isitsafe(boolean[][] board, int row, int col) {

		int r = row, c = col;

		// upper col
		while (r >= 0) {
			if (board[r][col]) {
				return false;
			}
			r--;
		}
		r = row;
		c = col;
		// upper right diagonal
		while (c < board.length && r >= 0) {
			if (board[r][c]) {
				return false;
			}
			c++;
			r--;
		}
		r = row;
		c = col;
		// upper left diagonal
		while (c >= 0 && r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}

		return true;
	}

	public static void Display(boolean[][] board, List<List<String>> ans, List<String> temp) {

		for (int i = 0; i < board.length; i++) {
			String s = "";
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j]) {
					s += "Q";
				} else {
					s += ".";
				}

			}
			temp.add(s);

		}
		ans.add(new ArrayList<>(temp));
		temp.clear();

	}

}
