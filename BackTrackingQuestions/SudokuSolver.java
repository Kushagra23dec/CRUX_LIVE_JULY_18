package BackTrackingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SudokuSolver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}

		}

		sudoku(board, 0, 0);

	}

	public static void sudoku(int[][] board, int row, int col) {

		if (col == 9) {
			row++;
			col = 0;
		}
		if (row == 9) {
			Display(board);
			return;
		}

		if (board[row][col] != 0) {
			sudoku(board, row, col + 1);
		} else {
			for (int val = 1; val <= 9; val++) {
				if (isitsafe(board, row, col, val)) {
					board[row][col] = val;
					sudoku(board, row, col + 1);
					board[row][col] = 0;
				}
			}
		}

	}

	public static boolean isitsafe(int[][] board, int row, int col, int val) {
		int r = 0;
		int c = 0;

		// for entire row
		while (c < 9) {
			if (board[row][c] == val) {
				return false;
			}
			c++;
		}

		// for entire column
		while (r < 9) {
			if (board[r][col] == val) {
				return false;
			}
			r++;
		}

		r = row - row % 3;
		c = col - col % 3;
		// for 3x3 matrix
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (board[i][j] == val) {
					return false;
				}
			}
		}

		return true;
	}

	public static void Display(int[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
