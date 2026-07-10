import java.util.*;
public class palindome{
    public static int rev(int num){
        int rev=0;
        while(num>0){
            int lastDigit= num%10;
            rev=(rev*10) + lastDigit;
            num=num/10;
        }
        return rev;
    }
    public static boolean palin(int num){
        boolean palin=true;
        if(num != rev(num)){
            palin=false;
        }
        return palin;
    } 
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
    boolean result= palin(num);
    System.out.println("Is it a palindome? " +result);
    }


    
}