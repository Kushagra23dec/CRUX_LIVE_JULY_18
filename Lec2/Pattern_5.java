//		* * * * *
// 		  * * * *
//  		* * *
//      	  * *
//              *
//
//

package Lec2;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int star = n;
		int space = 0;

		while (row <= n) {
			int i = 1;

			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			row++;
			star--;
			space +=1;
			System.out.println();

		}
	}

}
