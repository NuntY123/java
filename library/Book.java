package library;

import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private String author;
    private String isbn;
    private boolean isAvalible;

    public Book(int id, String title, String author, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        isAvalible = true;
    }

    public void notAvalible() {
        isAvalible = false;
    }

    public void Avalible() {
        isAvalible = true;
    }

    public boolean status() {
        return isAvalible;
    }

    public String getName() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getId() {
        return id;
    }

    @Override 
    public String toString() {
        return "Book { id: " + id + ", title: " + title + ", author: " + author + ", isbn: " + isbn + ", isAvalible" + isAvalible + " }"; 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book b = (Book) o;
        return Objects.equals(isbn, b.isbn);
    }

    @Override 
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
