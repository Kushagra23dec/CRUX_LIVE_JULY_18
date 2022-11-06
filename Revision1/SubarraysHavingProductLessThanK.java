package Revision1;

import java.util.Scanner;

public class SubarraysHavingProductLessThanK {

	public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        System.out.print(ProductLessThanK(a,k));

    }

    // Sliding Window Question, we have to find the maximum no of subarrays 
    // that has product less than K..
    // Here the size of subarray is variable 
    // and that's why it is Variable Sliding Window..
    public static int ProductLessThanK(int[] a , int k){
        int ei = 0, si = 0; // ending index and starting indiex
                            // both are initialized with 0.
        int ans = 0;    // ans holds initial max no of sub-array that has product less than k.
        int product = 1;   // holds product to compair with k, if less than k .
        while(ei<a.length){
            // grow 
            product *= a[ei];

            // shrink
            while(product>=k && ei >= si ){
                   product /=a[si];  // shrinking the subarray
                                    // by dividing element at si index;

                   si++; // increase the starting index.

            }
            // calculate answer
             
               ans += ei-si+1; // Accumulating the window size;
            
            // increment ei i,e. ending index.
            ei++;
        }

        return ans;
    }



}