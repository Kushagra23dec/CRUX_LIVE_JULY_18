package Recursion_Revision1;
import java.util.*;
public class Coin_Change {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 int amount = sc.nextInt();
	 int coinlength = sc.nextInt();
	 int[] coin = new int[coinlength];
	 for(int i = 0; i<coin.length; i++) {
		 coin[i] = sc.nextInt();
	 }
	 
		int ans = coinChange(coin,amount);
		
		System.out.println(ans);
	}

	private static int coinChange(int[] coin, int amount) {
		// TODO Auto-generated method stub
		
		int[][] dp = new int[coin.length][amount+1];
		
		for(int i = 1; i<dp[0].length; i++) {
			dp[0][i] = Integer.MAX_VALUE-1;
		}
		
		for(int i = 1; i<dp.length; i++) {
			for(int j = 1; j<dp[0].length; j++) {
				
				if(coin[i-1] > j) {
					 dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = Math.min(dp[i-1][j], 1 + dp[i][j-1]);
				}
			}
		}
		
		return (dp[coin.length-1][amount] > 10000)?-1:dp[coin.length-1][amount];
		
 
	}

}
