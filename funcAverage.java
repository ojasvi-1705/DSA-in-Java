import java.util.*;
public class funcAverage{
    public static float avg(float a, float b , float c){
        float average= (a+b+c)/3;
        return average;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float c = sc.nextFloat();
        float average= (float)avg(a,b,c);
        System.out.println(average);

    }
}