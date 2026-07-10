 import java.util.*;

 public class primenum{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
 System.out.println("enter a number: ");
 int n= sc.nextInt();



boolean isPrime=true;
for(int i=2; i<=Math.sqrt(n); i++){  //or (n-1)
    
    if(n==2) {
    System.out.println("prime");
    break;
}
    
    if(n%i==0){
        isPrime = false;
    }
}


if (isPrime==true)
{
    System.out.println("n is prime");
} else{
    System.out.println("n is not a prime");
}

    }
}