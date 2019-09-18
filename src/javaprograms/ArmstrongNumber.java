package javaprograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public void isArmstrong(int number) {
        int temp=number;
        int unitNum,result=0,rem=0;
        while (temp!=0) {
            rem=temp%10;
            result=result+(rem*rem*rem);
            temp=temp/10;
        }
        if(result==number) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        new ArmstrongNumber().isArmstrong(number);
    }
}
