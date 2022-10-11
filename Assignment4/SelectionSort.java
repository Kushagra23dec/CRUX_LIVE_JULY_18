package Assignment4;

import java.util.Scanner;

public class SelectionSort {
	
 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		selectionSort(a);

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}

	
	// selection sort function
	public static void selectionSort(int[] a) {
		 
		int n = a.length;
		 
		for(int i = 0; i<n;i++) {
			 
			for(int j = i+1; j<n; j++) {
				int mini  = i;
				if(a[j] < a[mini]) {
					int temp = a[mini];
					a[mini] = a[j];
					a[j] = temp;
					
					mini = j;
				}
			}
		}
		
	}
	
	
	
}
