package GstCalculatorV1;

import java.util.Scanner;

public class Shopping {
    int category, foodQuantity, furnitureQuantity;
    Scanner scanner=new Scanner(System.in);
    Calculate calculate=new Calculate();

    public void doShopping() {
        do {
            System.out.println("1.Food\n2.Furniture\n3.None");
            category = scanner.nextInt();
            switch (category) {
                case 1:
                    System.out.println("Enter quantity");
                    foodQuantity = scanner.nextInt();
                    calculate.calculateFoodbill(foodQuantity);
                    break;
                case 2:
                    System.out.println("Enter quantity");
                    furnitureQuantity = scanner.nextInt();
                    calculate.calculateFurnitureBill(furnitureQuantity);
                case 3:
                    break;
                default:
                    System.out.println("Enter valid choice.");
            }
        }while (category!=3);

    }
}
