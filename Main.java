import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr1 = new int[n];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();
			}
			int[] arr2 = new int[m];
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = sc.nextInt();
			}
			System.out.println(MaximumSum(arr1,arr2));
			t--;
		}
	}

	public static int MaximumSum(int[] arr1, int[] arr2) {
		int i = 0;// arr1
		int j = 0;// arr2
		int p = 0;// arr1 start
		int q = 0;// arr2 start
		int ans = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				int sum1 = 0;
				int sum2 = 0;
				for (int k = p; k <= i; k++) {
					sum1 = sum1 + arr1[k];
				}
				for (int k = q; k <= j; k++) {
					sum2 = sum2 + arr2[k];
				}
				ans = ans + Math.max(sum1, sum2);
				i++;
				j++;
				p = i;
				q = j;
			}
		}
		if (i == arr1.length) {
			for (int k = q; k < arr2.length; k++) {
				ans = ans + arr2[k];

			}
		}
		if (j == arr2.length) {
			for (int k = p; k < arr1.length; k++) {
				ans = ans + arr1[k];
			}
		}

		return ans;
	}
}