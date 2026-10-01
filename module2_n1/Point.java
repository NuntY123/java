package module2_n1;

import java.util.Objects;

public class Point {
    private double x;
    private double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }



    @Override 
    public String toString() {
        return "Point {x = " + x + ", y = " + y;
    }

    @Override 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point p = (Point) o;
        return (x == p.x && y == p.y); 
    }

    @Override 
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point p) {
        double x = p.getX();
        double y = p.getY();
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }
}
