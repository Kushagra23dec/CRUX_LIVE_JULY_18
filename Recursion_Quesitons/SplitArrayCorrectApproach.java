package Recursion_Quesitons;

import java.util.Scanner;

public class SplitArrayCorrectApproach {
	
	static int v = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n;i++)
			a[i] = sc.nextInt();
		
		FindSplit(a,0,"",0,"",0);
		
		System.out.print(v);
	}

	public static void FindSplit(int[] a, int i, String ans, int sum, String ans1, int sum1) {
		// TODO Auto-generated method stub
		
		if(i==a.length) {
			if(sum == sum1) {
				System.out.println(ans+"and "+ ans1);
				v++;
			}
			return;
		}
		
		FindSplit(a,i+1,ans+a[i]+" ",sum+a[i],ans1,sum1);
		FindSplit(a,i+1,ans,sum,ans1+a[i]+" ",sum1+a[i]);
		
	}

}
