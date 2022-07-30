package Lec1;
import java.util.Scanner;
public class GradeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int marks = s.nextInt();
		
		
		if(marks>=75) {
			System.out.println("A");
		}else if(marks<75 && marks>=65) {
			System.out.println("B");
		}else if(marks<65 && marks>=55) {
			System.out.println("C");
		}else if(marks<55 && marks>=45) {
			System.out.println("D");
		}else {
			System.out.println("Fail");
		}

	}

}
