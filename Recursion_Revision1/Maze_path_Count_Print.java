package Recursion_Revision1;
import java.util.*;
public class Maze_path_Count_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();

		int count = mazepath(r, c, 1, 1, "");
		System.out.println("\n"+count);
	}

	public static int mazepath(int r, int c, int hcount, int vcount, String ans) {
		if (r == 1 && c == 1) {
			System.out.print(ans + " ");
			return 1;
		}
		
		int a = 0,b=0;
		if (r > 1) {
			b+=mazepath(r-1, c, hcount, vcount + 1, ans + "V");
		}

		if (c > 1) {
			a+= mazepath(r, c-1, hcount + 1, vcount, ans + "H");
		}
		
		return a+b;
	}

}
