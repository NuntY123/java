package module2_n2;

public class N2 {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        Circle c = new Circle(15);
        Rectangle r = new Rectangle(5, 10);
        System.out.println(t.area());
        System.out.println(c.area());
        System.out.println(r.area());
    }
}
