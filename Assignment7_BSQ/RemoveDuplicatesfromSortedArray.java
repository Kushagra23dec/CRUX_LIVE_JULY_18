package Assignment7_BSQ;

import java.util.*;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		 int n = 3;
		 List<String> l = new ArrayList<>();
		 
		 generate(n,0,0,"",l);
		 
		// System.out.println(l);

	}
	
	public static void generate(int n, int open, int close,String ans, List<String> l){
        if(open == n && close == n){
//            l.add(ans);
        	System.out.println(ans);
            return;
        }
        if(open<n){
            generate(n,open+1,close,ans+"(",l);
        }
        if(close<open){
            generate(n,open,close+1,ans+")",l);
        }
    }

}
