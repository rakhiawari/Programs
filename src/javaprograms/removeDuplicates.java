package javaprograms;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicates {


    public String removeDuplicate(String str) {
        Set<Character> newString = new LinkedHashSet<>();
        for (int i = 0; i <= str.length() - 1; i++) {
            newString.add(str.charAt(i));
        }
        return newString.toString();
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        System.out.println(new removeDuplicates().removeDuplicate(str1));
    }
}
