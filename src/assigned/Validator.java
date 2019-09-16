package assigned;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validator {

    static Scanner scan = new Scanner(System.in);
    public static String validatePhoneNumber(String phone) {

        String temp;

        if (phone.matches("\\d{10}")) return phone;
            //validating phone number with -, . or spaces
        else if (phone.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return phone;
            //validating phone number with extension length from 3 to 5
        else if (phone.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return phone;
            //validating phone number where area code is in braces ()
        else if (phone.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return phone;
            //return false if nothing matches the input
        else {

            System.out.print("Enter valid phone number:");
//            scan.nextLine();
            temp = scan.nextLine();
            validatePhoneNumber(temp);
        }
        return phone;
    }

    public static String isemailValid(String email) {

        Boolean result;
        String temp;
        Scanner scan = new Scanner(System.in);
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        result = email.matches(regex);
        if(result==true)
        {
            return email;
        }
        else {
            System.out.println("Enter valid email:");
            temp=scan.nextLine();
            isemailValid(temp);
        }
        return email;
    }

//    final String regExp = "[0-9]+([,.][0-9]{1,2})?";

    public static String validateSalary(String salary) {

        Scanner scan = new Scanner(System.in);
        final String regExp = "[0-9]+([,.][0-9]{1,2})?";
        String temp;
        if (salary.matches(regExp)) {
            return salary;
        }
        else {
            System.out.println("Enter valid salary:");
            temp=scan.nextLine();
            validateSalary(temp);
        }
        return salary;
    }
   /* public static Date validateDate(String date) {
        Date dateOfBirth = null;
        String temp;
        try {
            dateOfBirth= new SimpleDateFormat("dd/MM/yyyy").parse(date);

        } catch (Exception ex) {
            System.out.println("Enter date in valid format:");
            temp=scan.nextLine();
            validateDate(temp);
        }
        return dateOfBirth;
    }*/
    public static String isNull(String temp) {
        if(temp.isEmpty()) {
            System.out.println("Null not acceptable! Enter valid data:");
            temp=scan.nextLine();
            isNull(temp);
        }
        return temp;
    }
}
