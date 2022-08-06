package Lec4;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {

			if (i % 2 != 0 || i == 2) {
//				 System.out.println(i+" ");
				int x = i, p = 2, np = 0;
				while (p < x / 2) {
					if (x % p == 0) {
//						 System.out.print(x+" ");
						np = 1;
						break;

					}

					p++;
				}
				if (np == 0) {
					System.out.print(x + " ");
				}

			}

			i++;
		}
	}

}
