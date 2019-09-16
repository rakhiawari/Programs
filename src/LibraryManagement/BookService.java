package LibraryManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookService {
    List<Books> bookList = new LinkedList<>();
    List<IssuedBooks> issuedBooksList = new LinkedList<>();
    List<IssuedBooks> returnBooksList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void addBook() {
        System.out.println("Enter book name:");
        String bookName = scanner.nextLine();

        System.out.println("Enter author name");
        String authorName = scanner.nextLine();
        String uniqueID = UUID.randomUUID().toString();
        Books book = new Books(uniqueID, bookName, authorName);
        bookList.add(book);
//        System.out.println("Added to list");
    }

    public void viewBooks() {
        for (Books e : bookList) {
            System.out.println(e.toString());
        }
    }

    public void issueBook() {
        System.out.println("Enter book name:");
        String bookName = scanner.nextLine();

        for (Books e : bookList) {
            if (e.getBookName().equals(bookName)) {
                System.out.println("book present");
                System.out.println("Enter customer name:");
                String custName = scanner.nextLine();
                String uniqueID = UUID.randomUUID().toString();
                DateFormat df = new SimpleDateFormat("dd/MM/yy");
                Date dateobj = new Date();
                String dateOfIssue = df.format(dateobj);
                IssuedBooks thisBook = new IssuedBooks(uniqueID, bookName, custName, dateOfIssue);
                issuedBooksList.add(thisBook);
                break;
            }
            else {
                System.out.println("Required book is not available.");
            }
        }
    }

    public void viewIssuedBooks() {
        for (IssuedBooks e : issuedBooksList) {
            System.out.println(e.toString());
        }
    }

    public IssuedBooks returnBook(String custName, String bookName) {
        for (IssuedBooks e : issuedBooksList) {
            if ((e.getCustName().equals(custName)) && (e.getBookName().equals(bookName))) {
                issuedBooksList.remove(e);
                break;
            } else {
                System.out.println("Book was not issued.");
            }
        }
        return null;
    }
}
