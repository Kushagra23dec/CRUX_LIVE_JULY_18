package Bitmasking;

import java.util.*;

public class IncredibleHulk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int ans = 0;
			int c = 1;

			while (n != 0) {
				n = n & (n - 1);
				ans++;
			}

			System.out.println(ans);
		}

		sc.close();

	}

}
