import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        String result = num%2 == 0 ? "Число четное" : "Число нечетное";
        System.out.println(result);
        scanner.close();

    }
}
