public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library(); // ✅ Corrected type

        // Add some books
        Book b1 = new Book("B101", "Java Basics", "James Gosling");
        Book b2 = new Book("B102", "Python Essentials", "Guido van Rossum");
        library.addBook(b1);
        library.addBook(b2);

        // Create a member
        Member m1 = new Member("M001", "Praveen");

        // Issue a book
        library.issueBook("B101", m1);

        // Try issuing the same book again
        library.issueBook("B101", m1); // should fail

        // Return the book
        library.returnBook("B101", m1);

        // Try returning a book not issued
        library.returnBook("B102", m1); // should fail
    }
}
