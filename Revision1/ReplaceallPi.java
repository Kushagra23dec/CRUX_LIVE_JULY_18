package Revision1;

import java.util.Scanner;

public class ReplaceallPi {

	public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        
        while(n-->0){
            String str = sc.next();
            

            for(int i = 0; i<str.length(); i++){
                if(str.charAt(i)=='p' && str.charAt(i+1) == 'i'){
                     System.out.print(3.14);
                      i=i+1;
                }
                else{
                    System.out.print(str.charAt(i));
                }

            }

            System.out.println();

        }
    }
}