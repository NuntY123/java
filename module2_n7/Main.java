package module2_n7;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("Бензиновый", 150);
        Car car = new Car("Skoda", engine);
        car.start();
        car.stop();
    }
}