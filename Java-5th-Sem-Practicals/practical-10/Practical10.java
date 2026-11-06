public class Practical10 {
 static class BankAccount {
 private String accountHolder;
 private String accountNumber;
 private double balance;
 BankAccount(String accountHolder, String accountNumber, double balance) {
 this.accountHolder = accountHolder;
 this.accountNumber = accountNumber;
 this.balance = Math.max(0, balance);
 }
 public String getAccountHolder() { return accountHolder; }
 public String getAccountNumber() { return accountNumber; }
 public double getBalance() { return balance; }
 public void deposit(double amount) {
 if (amount <= 0) {
 System.out.println("Deposit rejected: amount must be positive.");
 return;
 }
 balance += amount;
 System.out.println("Deposit successful: " + amount);
 }
 public void withdraw(double amount) {
 if (amount <= 0) {
 System.out.println("Withdrawal rejected: amount must be positive.");
 } else if (amount > balance) {
 System.out.println("Withdrawal rejected: insufficient balance.");
 } else {
 balance -= amount;
 System.out.println("Withdrawal successful: " + amount);
 }
 }
 }
 public static void main(String[] args) {
 BankAccount account = new BankAccount("Neha", "AC101", 1000);
 account.deposit(500);
 account.deposit(-100);
 account.withdraw(300);
 account.withdraw(0);
 account.withdraw(2000);
 System.out.println("Account holder: " + account.getAccountHolder());
 System.out.println("Account number: " + account.getAccountNumber());
 System.out.println("Final balance: Rs. " + account.getBalance());
 }
}
