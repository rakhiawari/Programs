package LibraryManagement;

import java.util.Scanner;

public class Working {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.ADMIN\n2.LIBRARIAN\n0.EXIT");
            System.out.println("Enter your choice:");
            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                        LibrarianService librarianService=new LibrarianService();
                        do {
                            System.out.println("1.Add\n2.View\n3.Delete\n0.Logout");
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    librarianService.addLibrarian();
                                    break;
                                case 2:
                                    librarianService.viewLibrarian();
                                    break;
                                case 3:
                                    System.out.println("Enter name you want to delete");
                                    scanner.nextLine();
                                    String name=scanner.nextLine();
                                    librarianService.deleteLibrarian(name);
                                case 0:
                                    break;
                                default:
                                    System.out.println("INVALID choice.");
                                    break;
                            }
                        }while (choice!=0);
                    break;
                case 2:
                    BookService bookService=new BookService();
                    do {
                        System.out.println("1.Add Books\n2.View Books\n3.Issue Books\n4.View Issued Books\n5.Return Books\n0.Logout");
                        choice=scanner.nextInt();
                        switch (choice) {
                            case 1:
                                bookService.addBook();
                                break;
                            case 2:
                                bookService.viewBooks();
                                break;
                            case 3:
                                bookService.issueBook();
                                break;
                            case 4:
                                bookService.viewIssuedBooks();
                                break;
                            case 5:
                                System.out.println("Enter customer name:");
                                scanner.nextLine();
                                String custName=scanner.nextLine();
                                System.out.println("Enter book name:");
                                String bookName=scanner.nextLine();
                                bookService.returnBook(custName,bookName);
                            case 0:
                                break;
                            default:
                                System.out.println("INVALID choice.");
                        }
                    }while (choice!=0);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("INVALID choice.");
                    break;
            }
        }while (choice!=0);
    }
}
