package module2_n3;

public class Image implements Printable {
    
    private String filename;
    private int w;
    private int h;

    public Image(String filename, int w, int h) {
        this.filename = filename;
        this.w = w;
        this.h = h;
    }

    @Override
    public void print() {
        System.out.println("Печать изображения: " + filename + " (" + w + "x" + h + ")");
    }
}
