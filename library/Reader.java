package library;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Reader {
    private int id;
    private String name;
    private String email;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Reader(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    } 

    public void takeBook(Book book) {
        borrowedBooks.add(book);
    }

    public void removeBook(Book book) {
        borrowedBooks.remove(book);
    }

    public boolean checkBook(Book book) {
        return borrowedBooks.contains(book);
    }

    public boolean emptyBooks() {
        return borrowedBooks.isEmpty();
    }

    public void showBooks() {
        if (emptyBooks()) {
            return;
        }
        for (Book b : borrowedBooks) {
            System.out.println("Книга №" + b.getId() + " " + b.getName() + ", автора " + b.getAuthor() + " (" + b.getIsbn() + ")");
        }
    }

    @Override 
    public String toString() {
        return "reader { id: " + id + ", name: " + name + ", email: " + email + " }"; 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader b = (Reader) o;
        return Objects.equals(email, b.email);
    }

    @Override 
    public int hashCode() {
        return Objects.hash(email);
    }
}
