package module2_n4;

public class BankAccount {

    private double balance;

    public BankAccount(double initBalance) throws IllegalArgumentException {
        if (initBalance < 0) {
            throw new IllegalArgumentException("Отрицательный баланс");
        }
        balance = initBalance;
    }

    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Отрицательная или нулевая сумма");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientFundsException("Денег на вывод передано больше баланса");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
    
}
