import java.util.Scanner;

class FoodApp {
    String appName;
    int total = 0;

    void addItem(int price) {
        total = total + price;
    }

    void showBill() {
        System.out.println("\nApp: " + appName);
        System.out.println("Total Bill: Rs" + total);
    }
}
public class Exp_14Feb {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodApp zomato = new FoodApp();  
        zomato.appName = "Zomato";

        int choice;

        System.out.println("\n Welcome to " + zomato.appName+ "\n");
        System.out.println("1. Pizza - Rs200");
        System.out.println("2. Burger - Rs120");
        System.out.println("3. Pasta - Rs150");
        System.out.println("4. Exit");

while (true) {
     System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 4)
            break;

            switch (choice) {
                case 1:
                    zomato.addItem(200);
                    break;
                case 2:
                    zomato.addItem(120);
                    break;
                case 3:
                    zomato.addItem(150);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        zomato.showBill();

        if (zomato.total > 500) {
            zomato.total -= 100;
            System.out.println("Discount Applied: Rs100");
        }

        System.out.println("Final Amount: Rs" + zomato.total);
        System.out.println("Order placed successfully via Zomato!");
    }
}


    
