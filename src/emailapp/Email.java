package emailapp;

import java.util.Scanner;

public class Email {

    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private String companySuffix= "innovect.com";
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstname, String lastname) {
        //getting first and last name.
        this.firstname = firstname;
        this.lastname = lastname;
        //getting a department name.
        this.department = this.setDepartment();
        System.out.println("EMAIL CREATED: " + this.firstname + " " + this.lastname);
        System.out.println("Department: " + this.department);
        //setting a random password.
        this.password = randomPassword(10);
        System.out.println("Your Password: " + this.password);
        //email creation
        email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix;
        System.out.println(email);
    }

    //DEPARTMENT
    private String setDepartment() {
        System.out.print("\nDEPARTMENTS:\n1.Sales\n2.Development\n3.Accounting\n4.None\nEnter Your Choice:");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if (choice == 1) {
            return "Sales";
        } else if (choice == 2) {
            return "Development";
        } else if (choice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    //RANDOM PASSWORD
    private String randomPassword(int length) {
        String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int ran = (int) (Math.random() * setPassword.length());
            password[i] = setPassword.charAt(ran);
        }
        return new String(password);
    }



}
