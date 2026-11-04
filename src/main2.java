import java.sql.SQLOutput;
import java.util.Scanner;
public class main2 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String customerName;
        int choice;
        int quantity;
        double price;
        double total;
        double payment;
        double change;
        String foodName;


        System.out.println("===== LIAN RESTAURANT =====");

        System.out.print("Enter customer name: ");
        customerName = scanner.nextLine();

        System.out.println("=== MENU ===");
        System.out.println("1. Burger         - $10.4");
        System.out.println("2. Fries          - $20.7");
        System.out.println("3. Chicken        - $40.9");
        System.out.println("4. Soft Drinks    - $5.5");

        System.out.print("\nEnter your order: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            foodName = "Burger";
            price = 10.4;
        }
        else if (choice == 2) {
            foodName = "Fries";
            price = 20.7;
        }
        else if (choice == 3) {
            foodName = "Chicken";
            price = 40.9;
        }
        else if (choice == 4) {
            foodName = "Soft Drinks";
            price = 5.5;
        }
        else {
            System.out.println("INVALID CHOICE");
        }

        System.out.print("Enter your quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("");






        scanner.close();
    }
}
