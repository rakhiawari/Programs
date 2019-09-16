package service;

import assigned.Employee;
import assigned.Validator;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class EmployeeService {

    ArrayList<Employee> arrayList = new ArrayList<>();
    ArrayList<Employee> removedList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Validator validator = new Validator();
    String temp;
    int uniqueID = 0;

    ListIterator<Employee> listIterator = arrayList.listIterator();

    public void input() {

        String phone = null;
        String email = null;
        Date dateOfBirth = null;

        System.out.println("First Name:");
        String firstName = scan.nextLine();
        firstName = validator.isNull(firstName);

        System.out.println("Middle Name:");         //Middle name
        String middleName = scan.nextLine();

        System.out.println("Last Name:");
        String lastName = scan.nextLine();
        lastName=validator.isNull(lastName);

        System.out.println("DOB:");                 //Date of Birth
        temp = scan.nextLine();

        System.out.println("Address Line 1:");
        String address1 = scan.nextLine();
        address1=validator.isNull(address1);

        System.out.println("Address Line 2:");
        String address2 = scan.nextLine();

        System.out.println("City:");
        String city = scan.nextLine();

        System.out.println("State:");
        String state = scan.nextLine();

        System.out.println("Country:");
        String country = scan.nextLine();

        System.out.println("E-mail:");              //E-mail
        String temp = scan.nextLine();
        validator.isemailValid(temp);

        System.out.println("Phone:");               //Phone
        temp = scan.nextLine();
        validator.validatePhoneNumber(temp);

        System.out.println("Department:");
        String department = scan.nextLine();
        department=validator.isNull(department);

        System.out.println("Designation:");
        String designation = scan.nextLine();
        designation=validator.isNull(designation);

        System.out.println("Salary:");              //Salary
        String salary = scan.nextLine();
        validator.validateSalary(salary);

        System.out.println("Joining Date:");
        String joiningDate = scan.nextLine();
        joiningDate=validator.isNull(joiningDate);

        //String uniqueID = UUID.randomUUID().toString();
        uniqueID = 1 + uniqueID;                    //Unique Id
        Employee addEmp = new Employee(firstName, middleName, lastName, dateOfBirth, address1, address2, city, state, country, email, phone, department, designation, salary, joiningDate, uniqueID);
        arrayList.add(addEmp);
    }

    public void viewEmployees() {

        for (Employee e : arrayList) {
            System.out.println(e);
        }
    }

    public Employee searchEmployee(int id) {
        for (Employee e : arrayList) {
            if (e.getUniqueID() == id) {
                System.out.println(e);
                return e;
            }
        }
        return null;
    }

    public void removeEmployee(int id) {
        Employee result = searchEmployee(id);
        if (result != null) {
            removedList.add(result);
            arrayList.remove(result);
            System.out.println(id + " Removed Successfully!");
        } else {
            System.out.println("ID not found");
        }
    }

    public void removedEmployeeList() {
        for (Employee e : removedList) {
            System.out.println(e);
        }
    }

    //update employee details
    public void update() {

        System.out.println("Enter the id you want to update:");
        int id = scan.nextInt();
        Employee result = searchEmployee(id);
        scan.nextLine();
        System.out.println("Enter Salary:");
        temp = scan.nextLine();
        result.setSalary(temp);

    }
}
