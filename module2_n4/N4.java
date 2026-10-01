package module2_n4;

public class N4 {
    public static void main(String[] args) {
        BankAccount user = new BankAccount(100);
        try {
            user.withdraw(500);
        }
        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            user.deposit(-50);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        user.deposit(50);
        user.withdraw(39);
        System.out.println(user.getBalance());
    }
}
