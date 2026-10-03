package module2_n7;

public class Engine {
    private String type;
    private int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    void start() {
        System.out.println("Двигатель " + type + "(" + horsepower + " л.с.) запущен.");
    }

    void stop() {
        System.out.println("Двигатель остановлен.");
    }
}