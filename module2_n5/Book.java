package module2_n5;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override 
    public String toString() {
        return "Book {" + title + " " + author + " " + isbn + "}";
    }

    @Override 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book b = (Book) o;
        return Objects.equals(b.isbn, isbn);
    }

    public int hashCode() {
        return Objects.hash(isbn);
    }

    public String GetTitle() {
        return title;
    }

    public String GetAuthor() {
        return author;
    }

    public String GetIsnb() {
        return isbn;
    }


}
