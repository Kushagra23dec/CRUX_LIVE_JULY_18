package RecursionBactracking2;

public class WordSearchProblem {

	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		
		for(int i = 0; i<board.length; i++) {
			for(int j = 0; j<board[0].length; j++) {
				if(word.charAt(0) == board[i][j]) {
				  boolean ans = 	wordSearch(board,i,j,word,0);
				  if(ans == true) {
					  System.out.println(true);
					  return;
				  }
				}
			}
		}
		
		System.out.print(false);

	}

	public static boolean wordSearch(char[][] board, int cr, int cc, String word, int idx) {
		
		if(word.length() == idx) {
			return true;
		}
		
		if(cr<0 || cc < 0 || cr>=board.length || cc >= board[0].length || word.charAt(idx) != board[cr][cc]) {
			return false;
		}
		
		board[cr][cc] = '&';
		
		int[] r = {-1,1,0,0};
		int[] c = {0,0,1,-1};
		
		for(int i = 0; i<4; i++) {
			
			boolean ans = wordSearch(board,cr+r[i],cc+c[i],word,idx+1);
			if(ans) {
				return ans;
			}
		}
		board[cr][cc] = word.charAt(idx);
		
		
		

		return false;
	}

}
