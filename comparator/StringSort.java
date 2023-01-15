package comparator;

import java.util.*;

public class StringSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] s = new String[n];
		
		for(int i=0; i<n; i++) {
			s[i] = sc.next();
		}
		
		Arrays.sort(s, new Comparator<>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.startsWith(o2)) {
	                return -1;				// -1 means no swapping
	            }
	            if(o2.startsWith(o1)) {
	                return 1;			// 1 means swapping
	            }
	            						
	            return o1.compareTo(o2);	//	+ve means swapping and -ve means no swapping also 0 means no swapping(equal).
			}
			
		});
	 
		
		for(String i: s) {
			System.out.println(i);
		}
		
		


	}

}
