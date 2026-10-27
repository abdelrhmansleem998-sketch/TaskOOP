public class Main {
    public static void main(String[] args) {
        // Test constructor with name only (balance = 0)
        BankAccount account1 = new BankAccount("أحمد");
        System.out.println("الحساب 1 - الاسم: " + account1.getName() + ", الرصيد: " + account1.getBalance());
        
        // Test constructor with name and balance
        BankAccount account2 = new BankAccount("محمد", 500.0);
        System.out.println("الحساب 2 - الاسم: " + account2.getName() + ", الرصيد: " + account2.getBalance());
        
        // Test deposit
        account1.deposit(1000.0);
        System.out.println("بعد الإيداع - الحساب 1: " + account1.getBalance());
        
        // Test withdraw
        boolean success = account2.withdraw(200.0);
        System.out.println("عملية السحب من الحساب 2: " + (success ? "نجحت" : "فشلت") + ", الرصيد: " + account2.getBalance());
        
        // Test withdraw more than balance
        success = account2.withdraw(500.0);
        System.out.println("محاولة سحب أكثر من الرصيد: " + (success ? "نجحت" : "فشلت") + ", الرصيد: " + account2.getBalance());
    }
}
