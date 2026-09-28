import java.util.Scanner;

public class NumberFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String[] number = scanner.nextLine().split("");
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += Integer.parseInt(number[i]);
        }
        System.out.println("Сумма искомого числа = " + sum);
        scanner.close();
    }
}