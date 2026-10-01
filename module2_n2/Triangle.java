package module2_n2;

public class Triangle extends Shape {
    private int s1;
    private int s2;
    private int s3;
    private int p;


    public Triangle(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override 
    public double area() {
        p = (s1 + s2 + s3)/2;
        if (checkTriangle()) {
            return Math.sqrt(p * (p-s1) * (p-s2) * (p-s3));
        }
        else {
            return -1;
        }
    }

    public boolean checkTriangle() {
        return s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1;
    }
}
