package module2;

public class Dog {
    String name;
    int age;
    private double balance;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public Dog() {
        this.name = "unknown";
        this.age = 0;
    }

    public void bark() {
        System.out.println(name + " говорит: Гав! " + age);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance += amount;
    }
}
