import java.util.*;

public class JavaBasics {
    public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter an number");
  int num= sc.nextInt();
 String result= (num>0)?"positive":"negative";
 System.out.println("The given number is:" + result);
    }
    }
//boilerplate code