package assigned;

import java.util.Date;
import java.util.UUID;

public  class Employee {


    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String email;
    private String phone;
    private String department;
    private String designation;
    private String salary;
    private String joiningDate;
   // String uniqueID = UUID.randomUUID().toString();
    private int uniqueID;

    public Employee(String firstName, String middleName, String lastName, Date dateOfBirth, String address1, String address2, String city, String state, String country, String email, String phone, String department, String designation, String salary, String joiningDate, int uniqueID) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.uniqueID = uniqueID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\nfirstName='" + firstName + '\'' +
                ", \nmiddleName='" + middleName + '\'' +
                ", \nlastName='" + lastName + '\'' +
                ", \ndateOfBirth='" + dateOfBirth + '\'' +
                ", \naddress1='" + address1 + '\'' +
                ", \naddress2='" + address2 + '\'' +
                ", \ncity='" + city + '\'' +
                ", \nstate='" + state + '\'' +
                ", \ncountry='" + country + '\'' +
                ", \nemail='" + email + '\'' +
                ", \nphone='" + phone + '\'' +
                ", \ndepartment='" + department + '\'' +
                ", \ndesignation='" + designation + '\'' +
                ", \nsalary='" + salary + '\'' +
                ", \njoiningDate='" + joiningDate + '\'' +
                ", \nuniqueID='" + uniqueID + '\'' + '\n' +
                '}';

    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
