package library;

import java.util.List;
import java.util.ArrayList;

public class Library {
    
    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();

    public void addBook(String title, String author, String isbn) {
        Book b = new Book(books.size() + 1, title, author, isbn);
        books.add(b);
        System.out.println("\nКнига успешно добавлена!\n");
    }

    public void deleteBook(int id) {
        if (id > books.size()) {
            System.out.println("\nТакой книги нету.\n");
            return;
        }
        books.remove(id - 1);
        System.out.println("\nКнига успешно удалена!\n");
    }

    public void register(String name, String email) {
        Reader reader = new Reader(readers.size() + 1, name, email);
        readers.add(reader);
        System.out.println("Читатель успешно добавлен!\n");
    }

    public void giveBook(int bookId, int readerId) {
        if (bookId > books.size()) {
            System.out.println("Нет книги с таким ID.");
            return;
        }
        if (readerId > readers.size()) {
            System.out.println("Нет читателя с таким ID.");
            return;
        }
        Book takeBook = books.get(bookId - 1);
        Reader takenReader = readers.get(readerId - 1);
        if (!takeBook.status()) {
            System.out.println("Данная книга сейчас недоступна!");
        }
        if (takeBook.status()); {
            takeBook.notAvalible();
            takenReader.takeBook(takeBook);
            books.set(bookId - 1, takeBook);
            readers.set(readerId - 1, takenReader);
            System.out.println("Читатель успешно взял книгу!");
        }
        
    }

    public void returnBook(int bookId, int readerId) {
        if (readers.isEmpty()) {
            System.out.println("Нет такого читателя");
            return;
        }
        if (books.isEmpty()) {
            System.out.println("Нет такой книги");
            return;
        }
        Reader reader = readers.get(readerId - 1);
        Book book = books.get(bookId - 1);
        if (reader.emptyBooks()) {
            System.out.println("У пользователя нет такой книги!");
            return;
        }
        if (!reader.checkBook(book)) {
            System.out.println("У пользователя нет такой книги!");
            return;
        }
        if (reader.checkBook(book)) {
            reader.removeBook(book);
            book.Avalible();
            books.set(bookId - 1, book);
            readers.set(readerId - 1, reader);
            System.out.println("Читатель вернул книгу.");
            return;
        }
        
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("На данный момент в библиотеке нет книг");
            return;
        }
        for(Book b : books) {
            if (b.status()) {
                System.out.println("Книга №" + b.getId() + " " + b.getName() + ", автора " + b.getAuthor() + "(" + b.getIsbn() + ") Доступна для получения");
            }

            if (!b.status()) {
                System.out.println("Книга №" + b.getId() + " " + b.getName() + ", автора " + b.getAuthor() + "(" + b.getIsbn() + ") НЕ доступна для получения");
            }
        }
    }

    public void showReaderBooks(int readerId) {
        if (readers.isEmpty()) {
            System.out.println("Нет такого читателя");
            return;
        }
        Reader reader = readers.get(readerId - 1);
        if(reader.emptyBooks()) {
            System.out.println("У пользователя нет книг!");
        }
        if (!reader.emptyBooks()) {
            reader.showBooks();
        }
    }



    public void findBookByAuthor(String author) {
        int i = 0;
        if (books.isEmpty()) {
            System.out.println("Таких книг нет");
        }
        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                System.out.println("Книга №" + b.getId() + ": " + b.getName() + ", " + b.getAuthor());
            }
            else {
                i++;
            }    
        }       
        if (i == books.size()) {
            System.out.println("Книг у такого автора нет");
        }
        
    }

    public void findBookByTitle(String title) {
        int i = 0;
        if (books.isEmpty()) {
            System.out.println("Таких книг нет");
        }
        for (Book b : books) {
            if (b.getName().equals(title)) {
                System.out.println("Книга №" + b.getId() + ": " + b.getName() + ", " + b.getAuthor());
            }
            else {
                i++;
            }    
        }       
        if (i == books.size()) {
            System.out.println("Книг с таким названием нет");
        }
    }



}
