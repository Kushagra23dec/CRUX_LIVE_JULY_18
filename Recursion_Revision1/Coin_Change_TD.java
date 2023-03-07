package Recursion_Revision1;

import java.util.*;

public class Coin_Change_TD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int amount = 9864;
//	 int coinlength = sc.nextInt();
		int[] coin = {411,412,413,414,415,416,417,418,419,420,421,422};
//	 for(int i = 0; i<coin.length; i++) {
//		 coin[i] = sc.nextInt();
//	 }
		 
 
		int ans = coinChange(coin, amount);

		System.out.println(ans + "ans");

	}

	
	public static int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] a : dp){
            Arrays.fill(a,-1);
        }
        Arrays.sort(coins);
        int ans = coin(coins,amount,0,dp );
        return (ans > 10000)? -1 : ans;    
    }

    public static int coin(int[] coins,int amount, int i, int[][] dp ){
        if(amount == 0){
            return 0;
        }
        
        if(i == coins.length){
            return Integer.MAX_VALUE-1;
        }



        if(dp[i][amount] !=-1  ){   
        return dp[i][amount];
        }


        int include = Integer.MAX_VALUE-1,notInclude = Integer.MAX_VALUE-1;

        if(amount >= coins[i]){
            include = 1 +  coin(coins,amount-coins[i],i,dp);
        }
            notInclude = coin(coins,amount,i+1,dp);

        return  dp[i][amount] =  Math.min(include,notInclude) ;


    }
}