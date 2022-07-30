//						* * * * *
//						* * * *
//						* * *
//						* *
//						*

 
package Lec2;
import java.util.Scanner;
public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int row = 1;
		int star = n;
	 
		
		while(row<=n) {
			int i =1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			row++;
			star--;
			System.out.println();
			
		}
		
		
		
		
		
		
		
		

	}

}
