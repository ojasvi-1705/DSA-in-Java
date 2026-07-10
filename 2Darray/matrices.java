import java.util.*;

public class matrices {
    public static void search(int matrix[][]){
        int n = matrix.length, m = matrix[0].length;
        int larg = Integer.MIN_VALUE;
        for (int i =0; i<n; i++){
            for (int j =0; j<m;j++){
                if(matrix[i][j]>=larg){
                    larg = matrix[i][j];
                     
                }
            }
        }
         System.out.println("largest number found"+ larg);

       
    }
    public static void main(String args[]){
        int matrix[][]= new int[3][3];
        int n =matrix.length;
        int m =matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i =0; i<n; i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
            
        }

        for(int i =0; i<n; i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix);

    }
    
}
