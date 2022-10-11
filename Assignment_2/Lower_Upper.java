package Assignment_2;

import java.util.Scanner;

public class Lower_Upper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char c = sc.next().charAt(0);

		if ((int) c >= 65 || (int) c <= 90) {
			System.out.println("UPPERCASE");
		} else if ((int) c >= 97 || (int) c <= 122) {
			System.out.println("lowercase");
		} else {
			System.out.println("Invalid");
		}

	}

}
