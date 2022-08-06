package Assignment1;

import java.util.Scanner;

public class Simple_Input {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] n = new int[5];
		int i = 0, sum = 0;

		while (i < 5) {
			n[i] = s.nextInt();
			i++;
		}

		i = 0;

		while (sum >= 0 && i < 5) {

			sum += n[i];
			if (sum < 0) {

				break;
			}
			i++;

		}
		i -= 1;
		int x = 0;
		while (x <= i) {
			System.out.println(n[x]);
			x++;
		}

	}

}
