package LibraryManagement;

public class Books {
    private String uniqueID, bookName, authorName;

    public Books(String uniqueID, String bookName, String authorName) {
        this.uniqueID = uniqueID;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Books{" +
                "uniqueID='" + uniqueID + '\'' +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }
}
