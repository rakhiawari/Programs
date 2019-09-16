package assigned;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int choice;
        Scanner scan=new Scanner(System.in);
        Tester tester=new Tester();
        do{
            System.out.println("1.HOME\n0.EXIT");
            System.out.println("Enter your choice:");
            choice=scan.nextInt();

            switch (choice) {

                case 1:
                    tester.homeMenu();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Enter valid option.");
                    break;
            }
        }while (choice!=0);
    }
}