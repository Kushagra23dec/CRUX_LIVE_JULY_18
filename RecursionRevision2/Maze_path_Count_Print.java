package RecursionRevision2;

import java.util.*;

public class Maze_path_Count_Print {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	
			int n = sc.nextInt();
			int m = sc.nextInt();
			int count = printMazePath(n, m, 1, 1, "");
	
			System.out.println("\n" + count);
		}
	
		public static int printMazePath(int row, int col, int currentRow, int currentCol, String ans) {
	
			if (currentRow > row || currentCol > col)
				return 0;
	
			if (currentRow == row && currentCol == col) {
				System.out.print(ans + " ");
				return 1;
			}
	
			int a = 0, b = 0;
			if (currentRow < row) {
				a += printMazePath(row, col, currentRow + 1, currentCol, ans + "V");
			}
			if (currentCol < col) {
				b += printMazePath(row, col, currentRow, currentCol + 1, ans + "H");
			}
	
			return a + b;
		}
	
	}
