package oopsjava;

public class Account {
    protected int acno; 
    protected float balance; 

    // Constructor with no arguments
    public Account() {
        
        acno = 0;
        balance = 0.0f;
    }

    // Constructor with two arguments
    public Account(int accountNumber, float initialBalance) {
        acno = accountNumber;
        balance = initialBalance;
    }

    
    public void withdraw(float amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Cannot withdraw $" + amount);
        }
    }

   
    public void deposit(float amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }

    // Getter method for account balance
    public float getBalance() {
        return balance;
    }

    
    public static void main(String[] args) {
        Account myAccount = new Account(12345, 1000);
        System.out.println("Initial balance: $" + myAccount.getBalance());

        myAccount.deposit(500.0f);
        myAccount.withdraw(2000.0f);
    }
}
