package module2_n5;

import java.util.HashSet;

public class N5 {
    public static void main(String[] args) {
        Book b1 = new Book("Война и мир", "Толстой", "978-5-04-116640-0");
        Book b2 = new Book("Война и мир", "Л.Н. Толстой", "978-5-04-116640-0");
        Book b3 = new Book("Анна Каренина", "Толстой", "978-5-04-116641-7");
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode() == b2.hashCode());
        HashSet<Book>set = new HashSet<Book>();
        set.add(b1);
        set.add(b2);
        set.add(b3);
        for (Book book : set) {
            System.out.println(book);
        }
        System.out.println(set.size());

    }
}
