package module2_n6;

public class Main {
    public static void main(String[] args) {
        StringParser sp = new StringParser();
        System.out.println(sp.parseInt("123"));
        try {
            System.out.println(sp.parseInt("abc"));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(sp.parseInt("-123"));
        System.out.println(sp.parseInt("12.5"));
        

    }
}
