import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(String bookId, Member member) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                if (!book.isIssued()) {
                    book.issue();
                    member.addBook(book);
                    System.out.println("Book issued: " + book.getTitle());
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String bookId, Member member) {
        for (Book book : member.getIssuedBooks()) {
            if (book.getBookId().equals(bookId)) {
                book.returnBook();
                member.removeBook(book);
                System.out.println("Book returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("This member has not issued the book.");
    }
}
