import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int correctPin = 12345;
        int enterPin;
        double balance = 5000.00;
        double withdrawal;
        double after;

        System.out.println("======== ATM ========");
        System.out.print("Enter the PIN: ");
        enterPin = scanner.nextInt();


        if (enterPin == correctPin) {
            System.out.println("YOU ENTERED SUCCESSFULLY");

            System.out.println("ACCOUNT BALANCE: $" + balance);

            System.out.print("Enter withdrawal amount: ");
            withdrawal = scanner.nextDouble();

            if (withdrawal <= 0) {
                System.out.println("INVALID AMOUNT");
            } else if (withdrawal > balance) {
                System.out.println("INSUFFICIENT BALANCE!");
            }
            else {
                after = balance - withdrawal;

                System.out.println("WITHDRAWAL SUCCESSFULLY");

                System.out.println("Withdrawn Amount: $" + withdrawal);
                System.out.println("Remaining Balance: $" + after);
            }

        }
        else {
            System.out.println("YOU ENTERED WRONG PIN!");
        }

        System.out.println("====THANk YOU=====");


        scanner.close();
    }
}
