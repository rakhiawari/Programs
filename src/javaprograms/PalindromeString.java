package javaprograms;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String  str1=scanner.nextLine();
        String str2=scanner.nextLine();
        PalindromeString palindrome=new PalindromeString();
        String temp=palindrome.reverseString(str1);
        if (str2.equals(temp)) {
            System.out.println("yes");
        }
        else System.out.println("no");
    }
    public String reverseString(String str1) {
        String reverse="";
        for(int i=str1.length()-1;i>=0;i--) {
            reverse=reverse+str1.charAt(i);
        }
        return reverse;
    }
}
