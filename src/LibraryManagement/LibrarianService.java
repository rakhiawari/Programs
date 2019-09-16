package LibraryManagement;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class LibrarianService {

    List<Librarian> librarianList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void addLibrarian() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter mobile number");
        String number = scanner.nextLine();
        String uniqueID = UUID.randomUUID().toString();
        Librarian librarian = new Librarian(uniqueID, name, number);
        librarianList.add(librarian);
//        System.out.println("Added to list");
    }

    public void viewLibrarian() {
        for (Librarian e : librarianList) {
            System.out.println(e.toString());
        }
    }

    public Librarian deleteLibrarian(String name) {
        for (Librarian e : librarianList) {
            /*String temp = e.getName();
            System.out.println(temp);*/
            if (e.getName().equals(name)) {
                System.out.println("if working");
               librarianList.remove(e);
            }
        }
        return null;
    }

    public static void main(String[] args) {


    }
}
