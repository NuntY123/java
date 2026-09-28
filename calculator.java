import java.util.Scanner;

public class calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);
        Scanner oper = new Scanner(System.in);
        Scanner checkOut = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Введите первое число: ");
            double num1 = number1.nextInt();
            System.out.print("Введите второе число: ");
            double num2 = number2.nextInt();
            System.out.print("Введите операцию (+, -, *, /): ");
            String operation = oper.nextLine().trim();
            if (operation.equals("/") && num2 == 0) {
                System.out.println("Ошибка деления на 0!");
            }
            else if (operation.equals("+")) {
                double result = add(num1, num2);
                System.out.println("Результат: " + result);
            }
            else if (operation.equals("-")) {
                double result = sub(num1, num2);
                System.out.println("Результат: " + result);
            }
            else if (operation.equals("*")) {
                double result = mul(num1, num2);
                System.out.println("Результат: " + result);
            }
            else if (operation.equals("/")) {
                double result = div(num1, num2);
                System.out.println("Результат: " + result);
            }
            else {
                System.out.println("Нет такой операции...");
            }

            System.out.print("Продолжить? (y/n): ");
            String symbol = checkOut.nextLine().trim();
            if (symbol.equals("y")) {
                continue;
            }
            else if (symbol.equals("n")){
                exit = true;
            }
            else {
                System.out.println("Неизвестная команда...");
            }
        }

        number1.close();
        number2.close();
        oper.close();
        checkOut.close();
    }
}
