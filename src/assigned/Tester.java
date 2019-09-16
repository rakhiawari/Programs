package assigned;

import service.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    public void homeMenu() {

        int choice;
        Scanner scan = new Scanner(System.in);
        EmployeeService employeeService=new EmployeeService();
        do {
            System.out.print("1.Add new employee\n2.Views employees\n3.Update employee salary\n4.Search employee by id\n5.Remove employee\n6.Views all removed employees\n0.Exit");
            System.out.print("\nEnter your choice:");
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    employeeService.input();
                    break;
                case 2:
                    employeeService.viewEmployees();
                    break;
                case 3:
                    employeeService.update();
                    break;
                case 4:
                    System.out.println("Enter the id you want to search:");
                    int id=scan.nextInt();
                    employeeService.searchEmployee(id);
                    break;
                case 5:
                    System.out.println("Enter the id you want to remove:");
                    id=scan.nextInt();
                    employeeService.removeEmployee(id);
                    break;
                case 6:
                    employeeService.removedEmployeeList();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Enter valid choice!");
                    break;
            }
        } while (choice != 0);
    }
}
