import java.util.*;
public class funcfactorial{
    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact= fact*i;
        }
return fact;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
       System.out.println("Enter a number: ");
        int x= sc.nextInt();

        int facto= factorial(x);
        System.out.println("the factorial is :" +facto);
        

    }
}