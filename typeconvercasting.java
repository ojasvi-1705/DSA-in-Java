import java.util.*;

public class typeconvercasting{
    public static void main(String args[]){
//    char ch = 'c';
//     int number = ch;
//     System.out.println(number);
    // char a ='a';
    // char b= 'b';
    // System.out.println(b-a);
    // int a = 10;
    // int b= 12;
    // System.out.println(a<b);
    // int a = 10;
    //  a-=10;
    // System.out.println(a);
   Scanner sc = new Scanner(System.in);
   int year = sc.nextInt();
   if((year%4==0)  && (year%100!=0  || (year%400==0))){
    System.out.println("Leap");
   }
      else{
        System.out.println("Not leap");
      }
    }
}