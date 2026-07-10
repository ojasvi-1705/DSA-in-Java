public class Patterns{
    public static void hollow_rectangle(int totalRows ,  int totalColumns){
        for(int i=1; i<=totalRows; i++){
            for(int j=1; j<=totalColumns; j++){
                if(i==1 || i==totalRows || j== 1 || j==totalColumns){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
    

    public static void inverted_rotated_Half_Pyramid(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
               
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_numbers(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
       System.out.println();
        }
    }


 public static void floyds_triangle(int n){
   int counter=1;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print( " " +counter+ " " );
            counter++;
        }
    System.out.println();
    }
 }

public static void zero_one_triangle(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if((i+j)%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
   System.out.println();
    }
}

    public static void butterfly_pattern(int n){
        //1st half
        for(int i=1; i<=n; i++){
            //stars--i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces--2*(n-i)
         for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }

           //stars--i 
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
        }
//2nd half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
         for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
        for(int j=1;j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }


    public static void solid_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
       //System.out.print("*****");
       System.out.println();
        }
    }



    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");

            }

            //hollow rectangle
            for(int j=1; j<=n; j++){
                if(i == 1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
           System.out.println();
                   }
    }


public static void diamond(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }
        for(int j=1; j<n-i; j++){
            System.out.print(" ");
        }
    
    System.out.println();
    }
     for(int i=n; i>=1; i--){
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }
        for(int j=1; j<n-i; j++){
            System.out.print(" ");
        }
    
    System.out.println();
    }
}
    
    public static void main(String args[]){
        diamond(5);

    }
    
    }