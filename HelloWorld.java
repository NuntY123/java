import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);
        System.out.println("Я буду Java разработчиком!");
    }
}