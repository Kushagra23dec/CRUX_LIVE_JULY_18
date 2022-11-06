package Revision1;

import java.util.Scanner;

public class RevisingQuadraticEquations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int x = (b * b) - (4 * a * c);

		if (x < 0) {
			System.out.println("Imaginary");
			return;
		}

		int root1 = (-b + (int) Math.sqrt(x)) / 2 * a;
		int root2 = (-b - (int) Math.sqrt(x)) / 2 * a;

		if (root1 == root2 && root1 > 0) {
			System.out.println("Real and Equal");
			System.out.println(root1 + " " + root1);

		} else if (root1 != root2) {
			System.out.println("Real and Distinct");
			System.out.println(Math.min(root1, root2) + " " + Math.max(root1, root2));

		}

	}

}
