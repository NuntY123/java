package module2_n3;

public class Document implements Printable {
    private String title;


    public Document(String title) {
        this.title = title;
    }
    @Override 
    public void print() {
        System.out.println("Печать документа: " + title);
    }
}
