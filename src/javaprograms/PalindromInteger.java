package javaprograms;

import java.util.Scanner;

public class PalindromInteger {

    public int reverse(int num) {
        int rem = 0, revesenum = 0;
        int temp=num;
        while (temp != 0) {
            rem = temp % 10;
            revesenum = ((revesenum * 10) + rem);
            temp = temp / 10;
        }
        return revesenum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        PalindromInteger palindromInteger=new PalindromInteger();
        int result=palindromInteger.reverse(number);
        if (number==result) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
