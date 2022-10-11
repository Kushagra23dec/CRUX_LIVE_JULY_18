package Lec14;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		
		
		
for(int row = 0; row<n; row++){
            
            for(int col = 1+row ; col<n; col++){
                
                int t = matrix[row] [col];
                matrix[row] [col]  = matrix[col] [row];
                matrix[col] [row] = t;
            }
            
        }
		
	
	
	for(int i = 0; i<n; i++) {
		for(int j = 0; j<n; j++) {
			System.out.print(matrix[i][j]+"  ");
		}
		System.out.println();
	}
	
	}

}
