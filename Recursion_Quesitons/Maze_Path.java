package Recursion_Quesitons;

import java.util.*;
public class Maze_Path {

	static long val = 0;
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int n1 = sc.nextInt();
         int n2 = sc.nextInt();
     

          System.out.print("\n"+MazePath(n1,n2,1,1,""));
     

    }

    public static int MazePath(int n1, int n2,int i, int j, String ans){
        
        if(i==n1 && j==n2){
             System.out.print(ans+" ");
         
            return 1;
        }
         
 
        int a = 0, b = 0;
        // for V-vertical
        if(i<n1){
          a =  MazePath(n1,n2,i+1,j,ans+"V");
        }
       // for H-horizontal
        if(j<n2){
           b = MazePath(n1,n2,i,j+1,ans+"H");

        }
        
        return a+b;

    }
}
