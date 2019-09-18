package javaprograms;

import java.util.Scanner;

public class ReverseString {

    public String reverseString(String str) {
        String revString="";
        for (int i=str.length()-1;i>=0;i--) {
            revString=revString+str.charAt(i);
        }
        return revString;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(new ReverseString().reverseString(str));
    }
}
