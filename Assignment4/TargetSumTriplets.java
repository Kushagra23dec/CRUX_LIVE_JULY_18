package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSumTriplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int target = sc.nextInt();
		 Arrays.sort(a);
		triplets(a, target);

	}

	// Triplets Function
	public static void triplets(int[] a, int target) {
		int n = a.length;
		int[] auxArray = new int[3];

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (a[i] + a[j] + a[k] == target) {
						auxArray[0] = a[i];
						auxArray[1] = a[j];
						auxArray[2] = a[k];
						
						Arrays.sort(auxArray);
						System.out.println(auxArray[0] + ", " + auxArray[1] + " and " + auxArray[2]);

					}
				}
			}
		}

	}

}

//for (int i = 0; i < n; i++) {
//	int a = i, b = 0, c = 0, count = 1, sum = arr[i];
//
//	for (int j = 0; j < n; j++) {
//
//		if (j != 0 && sum + arr[j] <= 10 && count < 3) {
//
//			sum += arr[j];
//			
//			if(count == 1) {
//				b = j;
//			}
//			else if(count == 2) {
//				c = j;
//			}
//			
//			count++;
//			
//			if(count == 2 && sum == target) {
//				break;
//			}
//			else if(count == 2) {
//				count--;
//				sum -= arr[c];
//				c = 0;
//			}
//		
//		}
//
//	}
//	
//	if(a!=0 && b!=0 && c!=0)
//	System.out.println(a + ", " + b + " and " + c);
//}
