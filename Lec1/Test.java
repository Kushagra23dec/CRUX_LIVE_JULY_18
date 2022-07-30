package Lec1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner s = new Scanner(System.in);
	   
	   int p= s.nextInt();
	   int r= s.nextInt();
	   int t= s.nextInt();
	   int si =1;
	   
	   si = (p*r*t)/100;
	    System.out.println(si);
	}

}
