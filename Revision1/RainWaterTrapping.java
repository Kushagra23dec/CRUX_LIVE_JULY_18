package Revision1;

import java.util.*;

public class RainWaterTrapping {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n > 0) {
			int size = sc.nextInt();
			int[] a = new int[size];

			for (int i = 0; i < size; i++) {
				a[i] = sc.nextInt();
			}

			System.out.println(trap(a));

			n--;
		}
		
		sc.close();
	}

	// trap function that returns total water
	public static int trap(int[] height) {

		int n = height.length;
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];

		leftMax[0] = height[0];
		for (int i = 1; i < n; i++) {

			leftMax[i] = (int) Math.max(height[i], leftMax[i - 1]);

		}

		rightMax[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i--) {

			rightMax[i] = (int) Math.max(height[i], rightMax[i + 1]);
		}

		int water = 0;
		for (int i = 0; i < n; i++) {
			water += (int) Math.min(leftMax[i], rightMax[i]) - height[i];
		}

		return water;

	}
}