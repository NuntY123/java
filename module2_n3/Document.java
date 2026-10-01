package module2_n3;

public class Document implements Printable {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }
    @Override 
    public void print() {
        System.out.println("Печать документа: " + title);
    }
}
