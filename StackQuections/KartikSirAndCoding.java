package StackQuections;
import java.util.*;
public class KartikSirAndCoding {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		int q = sc.nextInt();
		
		while(q-->0) {
			int a = sc.nextInt();
			if(a==2) {				
				int b = sc.nextInt();
				st.push(b);
			}else if(a==1) {
				//pop
				if(!st.isEmpty()) {
					System.out.println(st.pop());
				}else {
					System.out.println("No Code");
				}
				
			}
			
			
		}
		
		
	}

}
