import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 3 числа через пробел: ");
        String[] numbers = scanner.nextLine().split(" ");
        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            max = arr[0];
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число: " + max);
        scanner.close();
    }
}
