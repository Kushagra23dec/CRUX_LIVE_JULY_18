package BackTrackingQuestions;

import java.util.*;
public class DI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] st = new String[n];
        for(String s : st)
        PrintPattern(s);

    }

    public static void PrintPattern(String s){
        int val = 1;
		int[] a = new int[s.length()+1];

		for(int i = 0; i<=s.length(); i++){
			if( i == s.length() || s.charAt(i) == 'I'){
				a[i] = val;
				val++;
			
			for(int j = i-1; j>=0 && s.charAt(j) == 'D' ; j--){
				a[j] = val;
				val++;
			}

			}
		}

		for(int i : a){
			System.out.print(i);
		}
		System.out.println();
    }

}