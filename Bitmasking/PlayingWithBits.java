package Bitmasking;
import java.util.*;
public class PlayingWithBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ans = 0;
			for(int i = a; i<=b; i++) {
				ans += countSetBits(i);
			}
			System.out.println(ans);
		}

	}

	private static int countSetBits(int i) {
		 int c = 0;
		while(i>0) {
			c++;
			i = i & (i-1);
		}
		return c;
	}

}
