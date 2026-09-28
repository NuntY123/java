import java.util.Scanner;


public class NumberEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        String[] string = str.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = string.length - 1; i >= 0; i--) {
            sb.append(string[i]);
        }
        String reverseString = sb.toString();
        if (str.equals(reverseString)) {
            System.out.println("Палиндром");
        }
        else {
            System.out.println("Не палиндром");
        }
        scanner.close();

    }
}
