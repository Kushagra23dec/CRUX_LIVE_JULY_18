package Assignment_2;
import java.util.*;
public class QuadrarticRevising {
	 public static void main(String args[]) {
	        int a,b,c,root1,root2,x;
	        Scanner sc = new Scanner(System.in);

	        a = sc.nextInt();
	        b = sc.nextInt();
	        c = sc.nextInt();
	        x = b*b - 4*a*c;

	        if(x<0){
	           System.out.println("Imaginary");
	            System.exit(0);
	        }
	        root1 = (-b - (int) Math.sqrt(x))/2*a;
	        root2 = (-b + (int) Math.sqrt(x))/2*a;
	        
	        if(root1 == root2){
	            System.out.println("Real and Equal");
	            System.out.print(root1+ " "+ root1);

	        }
	        else if(root1 != root2){
	            System.out.println("Real and Distinct");
	           
	            if(root2>root1)
	           {
	             System.out.print(root1+ " "+ root2);  
	           } 
	            else{
	            System.out.print(root2+ " "+ root1);

	            }

	        }

	    }
}
