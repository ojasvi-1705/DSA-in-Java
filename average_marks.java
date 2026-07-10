
    import java.util.Scanner;
public class average_marks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        System.out.println("Average: " + (sum / 5));
    }
}


