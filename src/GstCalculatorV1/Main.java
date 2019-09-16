package GstCalculatorV1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        double billAmount;
        Scanner scanner = new Scanner(System.in);
        Calculate calculate = new Calculate();
        Shopping shopping=new Shopping();
        do {
            System.out.println("1.Shopping\n2.Generate Bill\n3.Logout");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    shopping.doShopping();
                    break;
                case 2:
                    billAmount = calculate.generateBill();
                    System.out.println("Bill Amount: " + billAmount);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter valid choice.");
                    break;
            }
        } while (choice != 3);
    }


}
