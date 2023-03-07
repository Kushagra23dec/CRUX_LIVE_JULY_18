package Recursion_Revision1;
import java.util.*;
public class Queen_Permutation {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int boardLength = sc.nextInt();
		 int totalQueen = sc.nextInt();
		 boolean[] board = new boolean[boardLength];
		 
		 printAnswer(board,totalQueen,"",0);

	}

	private static void printAnswer(boolean[] board, int totalQueen, String ans, int QueenPlacedSoFar) {
		 if(totalQueen == QueenPlacedSoFar) {
			 System.out.println(ans);
			 return;
		 }
		 
		 for(int i = 0; i<board.length; i++) {
			 
			 if(board[i] == false) {
				 board[i] = true;
				 printAnswer(board,totalQueen,ans+"b"+i+"q"+QueenPlacedSoFar, QueenPlacedSoFar+1);
				 board[i] = false;
			 }
		 }
		
	}

}
