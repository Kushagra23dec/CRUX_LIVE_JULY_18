package Revision1;

import java.util.Scanner;

public class AlexGoesShopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] itemsPrice = new int[n];
		for (int i = 0; i < n; i++) {
			itemsPrice[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		

		while (q-- > 0) {
			int alexMoney = sc.nextInt();
			int kItems = sc.nextInt();
			boolean f = false;
			int x = 0;

			for (int i = 0; i < n; i++) {
				if (alexMoney % itemsPrice[i] == 0) {
					x++;
					if (x == kItems) {
						f = true;
						break;
					}
				}
			}

			if (f) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		
		sc.close();

	}

}
