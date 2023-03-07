package RecursionRevision2;
import java.util.*;

public class Tower_Of_Hanoi {
 
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Toh(n,"A","B","C");
 
	}
	
	public static void Toh(int n, String src, String hlp, String des) {
		
		if(n==0) {
			return;
		}
		
		Toh(n-1,src,des,hlp);
		System.out.println("Move "+ n+"th disk from "+src+" to "+des);
		Toh(n-1,hlp,src,des);
		
		
		
		
	}

}
