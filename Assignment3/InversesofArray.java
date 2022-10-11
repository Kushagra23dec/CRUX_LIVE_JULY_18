package Assignment3;

import java.util.Scanner;

public class InversesofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		 
		int index = 0;
		for(int j = 0 ; j<n ; j++) {
			index = a[j];
			
			//a[index] = j;
			
			System.out.print(index+"  ");
		}
		
		
		
		
		
		
		
		
		for(int i = 0; i<n; i++) {
			System.out.print(a[i]+ " ");
		}
		
		
		
		
		
		

	}

}
