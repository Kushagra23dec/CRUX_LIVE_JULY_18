package Bitmasking;

import java.util.*;

import Assignment7_BSQ.RemoveDuplicatesfromSortedArray;

public class test {

	public static void main(String args[]) {

		int[] a = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		removeDuplicates(a);

	}

	public static int removeDuplicates(int[] nums) {

		if (nums.length == 1)
			return 1;

		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] == nums[i + 1]) {
				nums[i + 1] = -1000;
			}
		}

		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == -1000) {
					int t = nums[j];
					nums[j] = nums[i];
					nums[i] = t;
				}
			}
		}

		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != -1000) {
				k++;
			} else {
				break;
			}
		}

		return k;

	}
}