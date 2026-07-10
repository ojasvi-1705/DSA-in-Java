 import java.util.*;
 public class continueloop{
    public static void main(String args[]){
        /*for(int i=1; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }*/
       //display all nums by user except multiple of 10
 Scanner sc= new Scanner(System.in);

 do{
    System.out.print("enter num");
    int n= sc.nextInt();

    if(n%10==0){
        continue;
    } 
    System.out.print("number was " +n);
 }while(true);
    }
}