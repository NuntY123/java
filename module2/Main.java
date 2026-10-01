package module2;

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog();
        Dog a = new Dog("Бобик", 2);
        Dog b = new Dog("Шабак");
        Dog c = new Dog();
        rex.name = "Рекс";
        rex.age = 3;
        rex.bark();
        a.bark();
        b.bark();
        c.bark();
        a.setBalance(1000);
        double sum = a.getBalance();
        System.out.print(sum);
    }
}
