package RecursionRevision2;

import java.util.*;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int pow = 1, ans = 0;
		int initialBase = 10, requiredBase = 8;
		
		
		for (int i = number; i > 0; i /= requiredBase) {
			
			int rem = i % requiredBase;

			ans = ans + rem * pow;

			pow *= initialBase;

		}

		System.out.println(ans);

	}

}
