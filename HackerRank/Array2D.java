package HackerRank;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int[][] arr = {{1,2,3},
				 		{4,5,6},
				 		{7,8,9}};
		 
		 for(int i = 0 ;i<arr.length; i++) {
			 for(int j = 0; j<arr[0].length; j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 
		System.out.println( printIMatrix(arr) );
	}
	
	
	public static int printIMatrix(int[][] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j =0; j<arr[0].length; j++) {
				if(i==0) {
//					System.out.print(arr[i][j]+" ");
					sum+=arr[i][j];
				}else if(i%2==0) {
					//System.out.print(arr[i][j]+" ");
					sum+=arr[i][j];
				}
				else if(i%2!=0 && (i+j) % 2 ==0) {
					//System.out.print(arr[i][j]+" ");
					sum+=arr[i][j];
					}
				
			}
			
		}
		
		return sum;
	}

}
