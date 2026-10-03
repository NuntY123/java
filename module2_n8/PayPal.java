package module2_n8;

public class PayPal implements PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override 
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " руб. Через PayPal (" + email + ")");
    }
}
