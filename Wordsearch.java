import java.util.*;
public class Wordsearch {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        char[][] mat = new char[m][n];
        char[][] mat2 = new char[m][n];
        for(int i = 0; i<m;i++){
            String s = sc.next();

            for(int j = 0; j<n; j++){
                mat[i][j] = s.charAt(j);
                mat2[i][j] = mat[i][j];
            }
        }
        
       

        String[] list = new String[k];
        for(int i = 0; i<k; i++){
            String st = sc.next();
            list[i] = st;
        }

       
        

        for(int i = 0; i<k; i++){
             
        	
            String str = list[i];

        for(int x = 0; x<m; x++){
            for(int y = 0; y<n; y++){
                if(str.charAt(0) == mat[x][y]){
                        // System.out.println("0"+str);
                    boolean exist = search(mat,x,y,str,0);
                    if(exist == true){
                        System.out.print(str+" ");
                    }
                    mat = mat2;
                }
            }
        }
        
        } // end of list loop

    }

    public static boolean search(char[][] mat, int cr, int cc, String str, int i){
        if(str.length() == i){
            return true;
        }

        if(cr<0 || cc<0 || cr>=mat.length || cc>= mat[0].length || str.charAt(i) != mat[cr][cc]){
            return false;
        }

        // marking 
         mat[cr][cc] = '*';
         int[] row = {-1,1,0,0};
         int[] col = {0,0,1,-1};

         for(int itr = 0; itr<4; itr++){
             boolean check = search(mat,cr+row[itr],cc+col[itr],str,i+1);
             if(check){
            	 mat[cr][cc] = str.charAt(i);
                 return check;
             }
         }

        mat[cr][cc] = str.charAt(i);

        return false;


    }



}