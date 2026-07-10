import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Name- MAAYUKH MISRA");
        System.out.println("SAP ID- 590015222");
        System.out.println("(B-9)Data Science");

        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};

        boolean isVowel = false;

        for (int i = 0; i < vowels.length; i++) {
            if (ch == vowels[i]) {
                isVowel = true;
                break;
            }
        }

        if (isVowel) {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is NOT a Vowel");
        }

        sc.close();
    }
}
