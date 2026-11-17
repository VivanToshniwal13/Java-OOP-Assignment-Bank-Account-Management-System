
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Rahul", 5000);
        BankAccount acc2 = new BankAccount(102, "Aman", 3000);

        System.out.println("Account 1:");
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.checkBalance();

        System.out.println("\nAccount 2:")
        acc2.deposit(1500);
        acc2.withdraw(500);
        acc2.checkBalance();

        System.out.println("\n--- Final Account Details ---");
        acc1.displayDetails();
        acc2.displayDetails();
    }
}