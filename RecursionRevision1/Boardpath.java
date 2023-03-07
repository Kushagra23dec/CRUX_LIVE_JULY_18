package RecursionRevision1;

import java.util.*;

public class Boardpath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int boardSize = sc.nextInt();
		int boardFaces = sc.nextInt();

		int pathCount = boardPathcount(boardFaces, boardSize, "");
		System.out.println("\n" + pathCount);
	}

	private static int boardPathcount(int boardFaces, int targetSum, String ans) {
		if (targetSum == 0) {
			System.out.print(ans + " ");
			return 1;
		}

		if (targetSum < 0)
			return 0;
		int n = 0;
		for (int i = 1; i <= boardFaces; i++) {

			n += boardPathcount(boardFaces, targetSum - i, ans + i);

		}

		return n;

	}

}
