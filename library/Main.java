package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner chose_scanner = new Scanner(System.in);
        Scanner switch_scanner = new Scanner(System.in);

        Library lib = new Library();

        String promt = "=== Библиотека ===\n1. Добавить книгу\n2. Удалить книгу\n3. Зарегистрировать читателя\n4. Выдать книгу\n5. Вернуть книгу\n6. Показать все книги\n7. Показать выданные книги\n8. Найти книгу по названию\n9. Найти книгу по автору\n0. Выход\nВыберете: ";
        System.out.print(promt);
        String chose = chose_scanner.nextLine().trim();

        while (!chose.equals("0")) {
            switch (chose) {
                case "1":
                    System.out.print("=== 1. Добавление книги ===\nВведите название книги: ");
                    String title = switch_scanner.nextLine().trim();
                    System.out.println("");
                    System.out.print("Введите автора книги: ");
                    String author = switch_scanner.nextLine().trim();
                    System.out.println("");
                    System.out.print("Введите isbn книги: ");
                    String isbn = switch_scanner.nextLine().trim();
                    lib.addBook(title, author, isbn);
                    break;
                case "2":
                    System.out.print("=== 2. Удаление книги === \nВведите ID книги: ");
                    int ID = switch_scanner.nextInt();
                    lib.deleteBook(ID);
                    break;
                case "3":
                    System.out.print("=== 3. Регистрация читателя === \nВведите имя: ");
                    String name = switch_scanner.nextLine().trim();
                    System.out.println("");
                    System.out.print("Введите email: ");
                    String email = switch_scanner.nextLine().trim();
                    System.out.println("");
                    lib.register(name, email);
                    break;
                case "4":
                    System.out.print("=== 4. Выдача книги === \nВведите ID книги: ");
                    int bookId = switch_scanner.nextInt();
                    System.out.println("");
                    System.out.print("Введите ID читателя: ");
                    int readerId = switch_scanner.nextInt();
                    System.out.println("");
                    lib.giveBook(bookId, readerId);
                    break;
                case "5":
                    System.out.print("=== 5. Возврат книги === \nВведите ID книги: ");
                    int bookIdForReturn = switch_scanner.nextInt();
                    System.out.println("");
                    System.out.print("Введите ID читателя: ");
                    int readerIdForReturn = switch_scanner.nextInt();
                    System.out.println("");
                    lib.returnBook(bookIdForReturn, readerIdForReturn);
                    break;
                case "6":
                    System.out.println("=== 6. Все книги ===\n\n");
                    lib.showAllBooks();
                    break;
                case "7":
                    System.out.print("=== 7. Книги читателя ===\n\nВведите ID читателя: ");
                    int Id = switch_scanner.nextInt();
                    lib.showReaderBooks(Id);
                    break;
                case "8":
                    System.out.print("=== 8. Поиск книги по названию ===\n\nВведите название: ");
                    String titleBook = switch_scanner.nextLine().trim();
                    lib.findBookByTitle(titleBook);
                    break;
                case "9":
                    System.out.print("=== 9. Поиск книги по автору ===\n\nВведите автора: ");
                    String authorBook = switch_scanner.nextLine().trim();
                    lib.findBookByAuthor(authorBook);
                    break;


            }
            System.out.print(promt);
            chose = chose_scanner.nextLine().trim();

        }


        chose_scanner.close();
        switch_scanner.close();
    }
}
