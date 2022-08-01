//			*               * 
//			  *           *   
//			    *       *     
//			      *   *       
//			        *         
//			      *   *       
//			    *       *     
//			  *           *   
//			*               * 

package Lec2;

import java.util.Scanner;

public class Pattern_8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int i, j;

		for (i = 1; i <= n; i++) {

			for (j = 1; j <= n; j++) {
				if (i == j || ((n - i) + 1) == j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}

	}
}
