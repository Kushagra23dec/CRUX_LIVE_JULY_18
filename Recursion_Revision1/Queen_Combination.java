package Recursion_Revision1;
import java.util.*;
public class Queen_Combination {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int boardLength = sc.nextInt();
		 int totalQueen = sc.nextInt();
		 boolean [] board = new boolean[boardLength];
		 
		 printCombination(board,totalQueen,"",0,0);

	}

	private static void printCombination(boolean[] board, int totalQueen, String ans, int queenPlacedSoFar, int last) {
		 if(totalQueen == queenPlacedSoFar) {
			 System.out.println(ans);
			 return;
		 }
		 
		 for(int i = last;i<board.length; i++) {
			 if(board[i] == false) {
				 board[i] = true;
				 printCombination(board, totalQueen, ans+"b"+i+"q"+queenPlacedSoFar, queenPlacedSoFar+1, i+1);
				 board[i] = false;
			 }
		 }
		
	}

}
