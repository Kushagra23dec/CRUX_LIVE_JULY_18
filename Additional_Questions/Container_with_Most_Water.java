package Additional_Questions;

import java.util.Scanner;

public class Container_with_Most_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}

		System.out.println(maxArea(h));

	}

	public static int maxArea(int[] height) {
		int[] left = new int[height.length];
		int[] right = new int[height.length];
		int max = height[0];
		int n = height.length;
		int ans = 0;

		for (int i = 0; i < n; i++) {
			if (height[i] > max) {
				left[i] = height[i];
			} else {
				left[i] = max;
			}

		}

		max = height[height.length - 1];

		for (int i = height.length - 1; i >= 0; i--) {

			if (max < height[i]) {
				right[i] = height[i];
			} else {
				right[i] = max;
			}

		}

		for (int i = 0; i < n; i++) {
			System.out.print(left[i] + "  ");
		}

		for (int i = 0; i < n; i++) {
			System.out.print(right[i] + "  ");
		}

		System.out.println();

		return ans;
	}

}
