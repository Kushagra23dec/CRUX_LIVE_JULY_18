package Recursion_Revision1;
import java.util.*;
public class LiveSession23StringSubSecquence {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String str = sc.next();
		 List<String> ll = new ArrayList<>();
		 
		 SubSecquence(str,"",ll);
		 
		 System.out.println(ll);

	}
	
	public static void SubSecquence(String ques, String ans, List<String> ll ) {
		if(ques.length()==0) {
			ll.add(ans);
//			System.out.print(ans+" ");
			return;
		}
		
		char ch = ques.charAt(0);
		
		SubSecquence(ques.substring(1), ans+ch,ll);
		SubSecquence(ques.substring(1), ans+"",ll);
		
		
		
		
		
	}

}
