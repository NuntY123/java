package money_tracker;

import java.util.Objects;

public class User {
    private String userName;
    private int userId;
    private double balance;
    private boolean isAdmin;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public void spendMoney(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Успешно снято: " + amount);
        } else {
            System.out.println("Недостаточно денег на счете!");
        }
    }
        
    public User(String userName, int userId, boolean isAdmin) {
        this.userName = userName;
        this.userId = userId;
        this.isAdmin = isAdmin;
    }

    public User() {
        userName = "Guest";
        userId = -1;
        isAdmin = false;
    }
    
    @Override 
    public String toString() {
        return "Func { userName: " + userName + "\nuserId: " + userId + "\nbalance: " + balance + "\nIsAdmin: " + isAdmin;
    }

    @Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User func = (User) o;
    return Objects.equals(userName, func.userName)
            && userId == func.userId
            && balance == func.balance
            && isAdmin == func.isAdmin;
    }


    @Override 
    public int hashCode() {
        return Objects.hash(userName, userId, balance, isAdmin);
    }
}

