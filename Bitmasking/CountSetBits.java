package Bitmasking;

import java.util.*;

public class CountSetBits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int c = 0;
			while (n > 0) {
				c++;
				n = n & (n - 1);
			}
			System.out.println(c);
		}
	}
}
