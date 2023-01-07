package BinarySearchQuestionsRevision;

import java.util.*;
/*
 * Question Aggressive Cows
  Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls.
  The stalls are located along a straight line at positions x1,…,xN (0 <= xi <= 1,000,000,000).
  His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall.
  To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls,
  such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
  
  Input Format
  First line contains N and C, separated by a single space, representing the total number of stalls and number of cows respectively.
  The next line contains N integers containing the indexes of stalls.
  
  Constraints
	2 <= N <= 100,000
	0 <= xi <= 1,000,000,000
	2 <= C <= N

	Output Format
	Print one integer: the largest minimum distance.
	
	Sample Input
		5 3
		1 2 8 4 9
	
	Sample Output
		3
 */

public class AggressiveCows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stalls = sc.nextInt();
		int cows = sc.nextInt();
		int[] stallArray = new int[stalls];
		for (int i = 0; i < stalls; i++) {
			stallArray[i] = sc.nextInt();
		}

		int largestMinimumDistance = aggressiveCows(stalls, cows, stallArray);

		System.out.println(largestMinimumDistance);
	}

	// this function is to pick a mid value and pass it to isitpossible function to
	// check for validity.
	// and if ans is yes then we will increase the distance by, increasing lo=mid+1;
	// else hi = mid-1; if it is not valid;
	// and finally we will return the mid.
	private static int aggressiveCows(int stalls, int cows, int[] stallArray) {
		Arrays.sort(stallArray);
		int n = stallArray.length - 1;
		int lo = stallArray[0];
		int hi = stallArray[n];
		int ans = 0;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (isItPossible(cows, stallArray, mid)) {
				lo = mid + 1;
				ans = mid;
			} else {
				hi = mid - 1;
			}
		}

		return ans;
	}

	private static boolean isItPossible(int cows, int[] stallArray, int distance) {

		int n = stallArray.length;
		 
		int placedCows = 1;
		int pos = stallArray[0];
		
		
		for (int i = 1; i < n; i++) {
		
		if(stallArray[i] - pos >= distance) {
			placedCows++;
			pos = stallArray[i];
		}
			
			
		if(placedCows==cows) {
			return true;
		}
		
		}

		return false;
	}

}
