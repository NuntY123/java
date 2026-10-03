package module2_n7;

public class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    void start() {
        System.out.println("Запуск автомобиля " + model);
        engine.start();
    }

    void stop() {
        engine.stop();
        System.out.println("Автомобиль " + model + " остановлен");
    }
}