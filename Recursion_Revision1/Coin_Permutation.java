package Recursion_Revision1;

import java.util.*;

//input
//10
//4
//2 3 4 5

public class Coin_Permutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int amount = sc.nextInt();

		int coinlength = sc.nextInt();
		int[] coin = new int[coinlength];

		for (int i = 0; i < coinlength; i++) {
			coin[i] = sc.nextInt();
		}

		printCoinChange(coin, amount, "");

	}

	private static void printCoinChange(int[] coin, int amount, String ans) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < coin.length; i++) {
			if (amount >= coin[i]) {
				printCoinChange(coin, amount - coin[i], ans + coin[i]);
			}
		}

	}

}
