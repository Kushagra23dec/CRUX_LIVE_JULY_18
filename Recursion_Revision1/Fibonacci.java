package Recursion_Revision1;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(Fibo(n));
	}

	private static int Fibo(int n) {
		// TODO Auto-generated method stub
		if(n==1 || n==0) return n;
		
		return Fibo(n-1)+Fibo(n-2);
	}

}
