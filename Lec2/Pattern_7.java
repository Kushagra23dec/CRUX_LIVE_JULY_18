//	* * * * *
//	* 		*
//	* 		*
//	* 		*
//	* * * * *

package Lec2;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int row = 1;
		int star = n;
		int space = 0;
		
		while(row<=n) {
			int i=1;
			while(i<=space) {
				i++;
			}
			int j = 1;
			while(j<=star) {
				System.out.println("* ");
				j++;
			}
			row++;
			star++;
			space++;
			System.out.println();
		}
	}

}
