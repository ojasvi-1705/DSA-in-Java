import java.util.*;
public class fever{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      System.out.println("enetr the temperature");
        double temperature= sc.nextDouble();
        String fever=(temperature>=103.5)?"fever":"no";
        System.out.println(fever);

    }
}