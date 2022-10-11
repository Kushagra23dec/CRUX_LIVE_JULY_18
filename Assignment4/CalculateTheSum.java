package Assignment4;

import java.util.Scanner;

public class CalculateTheSum {
	

    public static void main(String[] args) {
			 
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			long arr[] = new long[n];
			long brr[]=new long[arr.length];
			for (int i = 0; i < arr.length; i++) {
		        arr[i] = sc.nextLong(); //nextLong
			}
	        for(int i=0;i<n;i++)
	            brr[i]=arr[i];
			int q = sc.nextInt();
			long ans = 0;
			while (q-- > 0) {
				int x=sc.nextInt();
				Sum(arr,brr,x);
				for(int i=0;i<n;i++)
	            arr[i]=brr[i];
	        }
	         ans=0; // taking out sum at the end only once
	        for(int i=0;i<n;i++)
	        {
	            ans+=brr[i];  
	        }
	        System.out.println(ans%(((long)Math.pow(10,9))+7));
		}
	    
	    
	    
	    public static void Sum(long[] arr,long brr[], int x) {
			 
			for (int i = 0; i < arr.length; i++) {
				int r=i-x;
				if(r<0) {
					r=arr.length+r;
				}
				
				brr[i]+=arr[r];
				
			}
		  
		}
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main(String[] args) {
//	 Scanner sc = new Scanner(System.in);
//	 int n = sc.nextInt();
//	 int[] a = new int[n];
//	 
//	 for(int i = 0; i< n; i++) {
//		 a[i] = sc.nextInt();
//	 }
//	 
//	 int[] a2 = new int[n];
//	 for(int i =0; i<n; i++) {
//		 a2[i] = a[i];
//	 }
//	 
//	 int q = sc.nextInt();
//	 int sum = 0;
//	 while(q>0) {
//		 
//		 int x = sc.nextInt();
//		 
//		 for(int i = 0; i< n; i++) {
//			 int p  = i - x;
//			 if(p<0) {
//				 
//				 p  = n + p;
//				 
//			 }
//			 a2[i] += a[p];
//			 
//		 }
//		 
// 
//		 q--;
//	 }
//	 
//	  for(int i = 0; i<n; i++) {
//			 a[i] += a2[i];
//			 
//			 sum +=a[i];
//		 }
//	  
//	 System.out.println( (sum % (int) ((Math.pow(10, 9))+7)) );
//	 
// 
//	}

}
