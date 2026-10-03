package module2_n8;

public class Cash implements PaymentMethod {


    @Override 
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " руб. Оплата наличными");
    }
}
