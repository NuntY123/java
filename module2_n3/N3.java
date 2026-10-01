package module2_n3;

public class N3 {
    public static void main(String[] args) {
        Document d = new Document("filename", "something");
        Image i = new Image("image", 1024, 960);
        Spreadseet s = new Spreadseet("filename", 10, 5);
        d.print();
        i.print();
        s.print();
    }
}
