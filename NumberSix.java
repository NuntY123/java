import java.util.Scanner;

public class NumberSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String[] number = scanner.nextLine().split("");
        StringBuilder sb = new StringBuilder();
        for (int i = number.length - 1; i >= 0; i--) {
            sb.append(number[i]);
        }
        String reverseString = sb.toString();
        System.out.println("Реверс искомого числа = " + reverseString);
        scanner.close();

    }
}
