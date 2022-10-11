package Lec29;

public class MergeTwoArray {

	public static void main(String[] args) {
		  
		 int[] arr1 = {5,3,4,1,2};
		 //int[] arr2 = {1,2,3,4,6,7};
		
	 	//int[] arr = mergeTwoArray(arr1,arr2);
		
		  int[] arr  = sort(arr1,0,arr1.length-1);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static int[] sort(int[] arr, int si, int ei) {
		if(ei==si) {
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}
		
		int mid = (si+ei)/2;
		int[] a = sort(arr,si,mid);
		int[] b = sort(arr,mid+1,ei);
		
		return mergeTwoArray(a,b);
		
	}
	
	

	public static int[] mergeTwoArray(int[] arr1, int[] arr2) {
		int[] arr = new int[arr1.length+arr2.length];
		
		int i = 0,j = 0, k = 0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				arr[k] = arr1[i];
				i++;
				k++;
			}
			else {
				arr[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i<arr1.length) {
			arr[k] = arr1[i];
			k++;
			i++;
		}
		
		while(j<arr2.length) {
			arr[k] = arr2[j];
			k++;
			j++;
		}
		
		return arr;
	}

}
