package javaprograms;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            if (i % 2 == 0 && i != 2) {
            } else if (i % 3 == 0 && i != 3) {
            } else if (i % 5 == 0 && i != 5) {
            } else
                System.out.println(i);
        }
    }
}
