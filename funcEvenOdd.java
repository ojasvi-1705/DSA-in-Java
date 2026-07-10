import java.util.*;
public class funcEvenOdd{
    public static boolean isEven(int n){
        boolean isEven=true;
        if(n%2!=0){
            isEven=false;
        }
        return isEven;
    }
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int n= sc.nextInt();
    boolean result=isEven(n);
    System.out.println("The number is Even: " +result);

}
}
