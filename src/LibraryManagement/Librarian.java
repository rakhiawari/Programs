package LibraryManagement;

public class Librarian {

    private String uniqueID, name, number;

    public Librarian(String uniqueID, String name, String number) {
        this.uniqueID = uniqueID;
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "uniqueID='" + uniqueID + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
