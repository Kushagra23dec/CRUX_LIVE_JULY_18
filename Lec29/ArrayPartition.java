package Lec29;

public class ArrayPartition {

	public static void main(String[] args) {
		int[] arr1 = { 3, 5, 1, 7, 2, 9, 11, 4 };

		sort(arr1, 0, arr1.length - 1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

	public static void sort(int[] arr, int si, int ei) {

		// base case hits when "si" is greater than "ei" (i,e. pi-1(ei) < pi+1(si) )
		if (si > ei) {
			return;
		}

		// finding the index of element at ei index and , placing it in it's right
		// position
		int pi = partition(arr, si, ei);
		// sending left array from pi
		sort(arr, si, pi - 1);
		// sending right array from pi
		sort(arr, pi + 1, ei);
	}

	// This method does two things..
	// 1. it places the element at "ei" index at its right place.
	// 2. it returns the index of that right place.
	private static int partition(int[] arr1, int si, int ei) {

		// store end element int a variable called item..
		int item = arr1[ei];

		// let the index for item be si(means 0th element)
		int pi = si;

		// Now, traversing the array from si to ei-1
		for (int i = si; i < ei; i++) {
			// And checking if any element less than "item"...
			if (arr1[i] < item) {
				// If true swap that element with the pi index, ( index that was for item )
				int t = arr1[i];
				arr1[i] = arr1[pi];
				arr1[pi] = t;

				// Now there is an element less than "item" at "pi" index
				// so, we increase pi by 1.
				pi++;
			}

		}
		// once we finish traversing the array, and got the right "pi" index
		// swap that "pi" element with "ei" element(that is item)..
		int t = arr1[pi];
		arr1[pi] = arr1[ei];
		arr1[ei] = t;

		// and now return the correct index of "item" that is "pi".
		return pi;
	}

}
