package module2_n3;

public class Spreadseet implements Printable {
    
    private String name;
    private int rows;
    private int cols;

    public Spreadseet(String name, int rows, int cols) {
        this.name = name;
        this.rows = rows;
        this.cols = cols;
    }

    @Override 
    public void print() {
        System.out.println("Печаит таблицы: " + name + " (" + rows + "x" + cols + ")");
    }
}
