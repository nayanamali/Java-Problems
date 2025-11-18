// Custom Exception Class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw method that uses throw
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Not enough funds in the account.");
        }

        balance -= amount;
        System.out.println("Withdrawal successful! Remaining Balance: " + balance);
    }
}

// Main Class
public class TestBank {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000); // Initial balance = 1000

        try {
            account.withdraw(1500); // Trying to withdraw more than balance
        } catch (InsufficientFundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
