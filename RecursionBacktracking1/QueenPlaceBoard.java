package RecursionBacktracking1;

import java.util.Scanner;

public class QueenPlaceBoard {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 boolean[] board = new boolean[n];
		 int totalQueen = sc.nextInt();
		 
		 System.out.println(queenPlaceBoard(board,totalQueen,0,""));

	}
	// qpsf --------------- QUEEN PLACE SO FAAR
	public static int queenPlaceBoard(boolean[] board, int totalQueen, int qpsf, String ans) {
		
		if(qpsf==totalQueen) {
			System.out.println(ans);
			return 1;
		}
		
		int a = 0;
		
		for(int i = 0; i<board.length; i++) {
			if(board[i]==false) {
				board[i] = true;
				a += queenPlaceBoard(board,totalQueen,qpsf+1,ans+"b"+i+"q"+qpsf);
				board[i]=false;
			}
		}
		return a;
	}

}
