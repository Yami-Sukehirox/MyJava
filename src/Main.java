//import java.lang.foreign.StructLayout;
//
//public class main {
//    public static void main(String[] args) {
//
//        int age = 18;
//        double grade = 3.5;
//        char letter = 'A';
//        boolean Student = true;
//        boolean mInor = true;
//
//        String name = "Lian Angelo Q Cruspero";
//        String food = "Burger";
//
//        System.out.println("My age is " +age);
//        System.out.println("My grade is " + grade);
//        System.out.println("My favorite letter is " + letter);
//        System.out.println(Student);
//
//        if(mInor) {
//            System.out.println("Your are a minor");
//        }
//        else {
//            System.out.println("You are old");
//        }
//
//        System.out.println("Hello " + name);
//        System.out.println("My favorite food is " + food);
//
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + "years old");
//
//        if(mInor){
//            System.out.println("Your are " + age + " years old");
//        }
//        else {
//            System.out.println("You are adult");
//        }
//    }
//}

//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//
//        double width = 0;
//        double height = 0;
//        double area = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the width: ");
//        width = scanner.nextDouble();
//
//        System.out.print("Enter the height: ");
//        height = scanner.nextDouble();
//
//        area = width * height;
//
//        System.out.println("The are of a triagle is " + area + "cm^2");
//
//
//        scanner.close();
//    }
//}

//import java.util.Scanner;
//
//public class main  {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        String adjective1;
//        String noun1;
//        String adjective2;
//        String verb1;
//        String adjective3;
//
//
//        System.out.print("Enter the adjective1: ");
//        adjective1 = scanner.nextLine();
//
//        System.out.print("Enter the noun1: ");
//        noun1 = scanner.nextLine();
//
//        System.out.print("Enter the adjective2: ");
//        adjective2 = scanner.nextLine();
//
//        System.out.print("Enter the verb1: ");
//        verb1 = scanner.nextLine();
//
//        System.out.print("Enter the adjective3: ");
//        adjective3 = scanner.nextLine();
//
//        System.out.println("Today I went to a " + adjective1 + " zoo");
//        System.out.println("In a exhibit, I saw a " + noun1 + ".");
//        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
//        System.out.println("I was " + adjective3 + "!");
//
//        scanner.close();
//
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String items;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What food do you want? ");
        items = scanner.nextLine();

        System.out.print("What is the price? ");
        price = scanner.nextDouble();

        System.out.print("How much you wanna buy? ");
        quantity = scanner.nextInt();

        total = price + quantity;

        System.out.println("\nYou have bought " + quantity + " " + items + "/s");
        System.out.println("Your total is " + currency + total);


        scanner.close();

    }
}
