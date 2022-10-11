package Assignment4;

import java.util.Scanner;

public class MaximumSumPathTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n > 0) {

			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int[] arr1 = new int[n1];
			int[] arr2 = new int[n2];

			for (int i = 0; i < n1; i++) {
				arr1[i] = sc.nextInt();
			}

			for (int i = 0; i < n2; i++) {
				arr2[i] = sc.nextInt();
			}

			System.out.println(maximumSum(arr1, arr2));

			n--;
		}

	}

	public static int maximumSum(int[] arr1, int[] arr2) {
		int sum = 0;
		int[] left = new int[arr1.length];
		for(int i = 0;i<arr1.length;i++) {
			
			if(arr1[i] >= arr2[i]) {
				sum +=arr1[i];
			}else if(arr2[i] > arr1[i]) {
				sum +=arr2[i];
			}
		}
		
		return sum;
	}

}
