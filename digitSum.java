import java.util.*;
public class digitSum{
    public static int Sum(int num){
        int totalSum=0;
         while(num>0){
        int lastDigit= num%10 ;
        totalSum = totalSum + lastDigit;
        num=num/10;
        }
        return totalSum ;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        int result= Sum(num);
        System.out.println("The sum of all digits is: " +result);
    }
}