import java.util.*;
public class clock{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter day:hour:minute");
   int day = sc.nextInt();
   int hour = sc.nextInt();
   int minute = sc.nextInt();
   // GMT to IST
   hour +=5;
   minute +=30;

   if(minute >= 60){
    hour++;
    minute -= 60;
   }

   if(hour>=24){
    day++;
    hour -= 24;
   }

  
    System.out.println("Day: " + day + ",Hour: " + hour + ",minutes: " + minute);

    }

    }