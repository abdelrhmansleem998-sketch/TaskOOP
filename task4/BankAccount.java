public class BankAccount {
    private String name;
    private double balance;
    
    public BankAccount(String name) {
        this.name = name;
        this.balance = 0.0;
    }
    
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    public String getName() { return name; }
    public double getBalance() { return balance; }
    
    public void deposit(double amount) { if (amount > 0) balance += amount; }
    public boolean withdraw(double amount) { if (amount > 0 && amount <= balance) { balance -= amount; return true; } return false; }
}
