package javaprograms;

import java.util.Scanner;

public class Factorial {

    public int doFactorization(int number) {
        /*int sum=1;
        for (int i=1;i<=number;i++) {
            sum=sum*i;
        }
        return sum;*/
        if(number==0){
            return 1;
        }
        return number*doFactorization(number-1);
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(new Factorial().doFactorization(number));
    }
}
