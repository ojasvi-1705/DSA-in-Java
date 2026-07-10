import java.util.*;


public class breakloop{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       /* for(int i=1; i<=5; i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }*/

// keep entering numbers till user enters a multiple of 10
 


 do{
    System.out.println("enter your number");
    int n= sc.nextInt();
    if(n%10==0){
        break;
    }
    System.out.println(n);
 }while(true);

    }
}