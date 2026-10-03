package module2_n8;

public class CreditCard implements PaymentMethod {
    private int cardNumber;
    private String holderName;

    public CreditCard(int cardNumber, String holderName) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
    }

    @Override 
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " руб. Картой " + cardNumber + " (" + holderName + ")");
    }
}
