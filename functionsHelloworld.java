import java.util.*;
public class functionsHelloworld{
    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    public static int calculateSum(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int a= sc.nextInt();
int b= sc.nextInt();
int Sum = calculateSum(a,b);
System.out.println("the sum is: " +Sum);
    }
}