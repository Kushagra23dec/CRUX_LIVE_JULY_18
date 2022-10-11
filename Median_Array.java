import java.util.Scanner;

public class Median_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		int [] a = {1,3};
		int [] a2 = {2};
		
		System.out.println(findMedianSortedArrays(a,a2));
		
		 
	}
	
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int n2 =  nums2.length;
        int[] a = new int[n+n2];
        int m1 =0,m2=0;
        if((n+n2)%2==0){
            m1 = (n+n2)/2;
            m2 = m1;
            m1 -= 1;
            
        }else{
            m1 = (n+n2)/2;
        }
        int x=0,y=0, i= 0;
        
        // loop
        while (x<n || y<n2) {
            
            // both have same index range as of now
              if(x<n && y<n2){
                if(nums1[x] < nums2[y]){
                   a[i] = nums1[x];
                    i++;
                    x++;
                }else{
                    a[i] = nums2[y];
                   i++;
                    y++;
                }
                
              }
                
            else if(y<n2){
                a[i] = nums2[y];
                y++;
                i++;
                
            }
            else if(x<n){
                a[i] = nums1[x];
                x++;
                i++;
            }
            
         
            
        }
        
        // ans 
        double ans = 0;
        if((n+n2)%2==0){
            ans = (a[m1]+a[m2]);
             ans /=2;
        }else{
            ans = a[m1];
        }
        
         
        return a[m1];
    }


}
