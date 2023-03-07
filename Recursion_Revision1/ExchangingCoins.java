package Recursion_Revision1;

import java.util.*;

public class ExchangingCoins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		HashMap<Long, Long> dp = new HashMap<>();

		long ans = ExchangeMaxGold(n, dp);
		System.out.println(ans);

	}

	private static long ExchangeMaxGold(long n, HashMap<Long, Long> dp) {

		if (n < 12) {
			return n;
		}

		if (dp.containsKey(n)) {
			return dp.get(n);
		}

		long ans = Math.max(n, ExchangeMaxGold(n / 2, dp) + ExchangeMaxGold(n / 3, dp) + ExchangeMaxGold(n / 4, dp));
		dp.put(n, ans);
		return dp.get(n);
	}

}
