package Recursion3LecFriday;

import java.util.*;

public class Lexicographic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] str = new String[n+1];
		List<String> li = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			li.add(i + "");
			str[i] = i+"";
		}

		 
		Collections.sort(li);
  
		
	}

}
