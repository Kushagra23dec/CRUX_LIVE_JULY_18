package Recursion_Revision1;

import java.util.*;

//input
//10
//4
//2 3 4 5

public class Coin_Combination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int amount = sc.nextInt();

		int coinlength = sc.nextInt();
		int[] coin = new int[coinlength];

		for (int i = 0; i < coinlength; i++) {
			coin[i] = sc.nextInt();
		}

		printCoinChange(coin, amount, "",0);

	}

	private static void printCoinChange(int[] coin, int amount, String ans,int last) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = last; i < coin.length; i++) {
			if (amount >= coin[i]) {
				printCoinChange(coin, amount - coin[i], ans + coin[i],i);
			}
		}

	}

}
