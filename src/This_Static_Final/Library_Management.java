package This_Static_Final;
import java.util.Scanner;
class Library_Management {
    static String libraryName = "City Central Library";
    private final String isbn;
    private String title;
    private String author;
    Library_Management(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    static void display_Library_Name() {
        System.out.println("Library Name: " + libraryName);
    }

    void display_Details() {
        if (this instanceof Library_Management)
        {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
        else
        {
            System.out.println("Not a valid Library_Management object.");
        }
    }
}
class Library_Management_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        Library_Management[] books = new Library_Management[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            System.out.print("Enter ISBN: ");
            String isbn = sc.nextLine();
            books[i] = new Library_Management(title, author, isbn);
        }
        System.out.println();
        Library_Management.display_Library_Name();
        System.out.println();
        for (Library_Management b : books) {
            b.display_Details();
            System.out.println();
        }
        sc.close();
    }
}

