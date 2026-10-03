package module2_n8;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<PaymentMethod> array = new ArrayList<>();
        Cash cash = new Cash();
        CreditCard creditCard = new CreditCard(1100220033, "Oleg");
        PayPal payPal = new PayPal("zoviefrag@gmail.com");
        array.add(cash);
        array.add(creditCard);
        array.add(payPal);
        for (PaymentMethod el : array) {
            el.pay(1000);
        }

    }
}
