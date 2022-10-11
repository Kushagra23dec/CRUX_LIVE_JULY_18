package Assignment3;

import java.util.Scanner;

public class PairofRoses {
	
 
	
	// Sorting Function
	public static void sort(int [] a) {
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 1; j<a.length; j++) {
				
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	
	// DeepakShould function
	public static void DeepakShould(int [] a,int n,int sum) {
		boolean f = false;
		int diff = 0, x = 1;
		int [] specialArray = new int[3];
		
		for(int i = 0; i<n-1; i++) {
			
			for(int j = i+1; j<n-1; j++) {
				if(sum == a[i]+a[j]) {
					if(x==1) {
						diff = a[j] - a[i];
						x = 0;
					}
		
					if(a[j]-a[i] <= diff) {
						specialArray[0] = a[j] - a[i];
						specialArray[1] = i;
						specialArray[2] = j;	
					}
					
					 
				}	
			
			}
			
			
		}
		
		if(a[specialArray[2]]<=a[specialArray[1]])
		System.out.println("Deepak should buy roses whose prices are "+ a[specialArray[2]]+ " and "  +a[specialArray[1]]+".");
		else
		System.out.println("Deepak should buy roses whose prices are "+ a[specialArray[1]]+ " and "  +a[specialArray[2]]+".");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		// no of test cases
		while(times>0) {
			
			// capacity of array
			int n = sc.nextInt();
			int[] a = new int[n];
			
			// filling the array
			for(int i = 0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			
			// Sorting the array
			sort(a);
			
			int sum = sc.nextInt();
			
			
			
			DeepakShould(a,n,sum);
			
	 
			times--;
			
		}

	}

}
