package javaprograms;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int next,first=0,second=1;
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for (int i=0;i<=number;i++) {
            if(i<=1) {
                next=i;
            }
            else {
                next=first+second;
                first=second;
                second=next;
            }
            System.out.println(next);
        }
    }
}
