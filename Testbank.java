

// Custom Exception Class
class InsufficientFunds extends Exception {
    public InsufficientFunds(String str)
    {
        super(str);
    }
}

// Bank Account Class
class TestBank {
    private double balance;

    public TestBank(double balance)
   {
        this.balance = balance;
    }

    
    public void withdraw(double amount) throws InsufficientFunds
    {
        if (balance < amount) 
       {
            throw new InsufficientFunds("Not enough funds in the account.");
        }

        balance -= amount;
        System.out.println("Withdrawal successful! Remaining Balance: " + balance);
    }

    public static void main(String[] args) 
    {

        TestBank account = new TestBank(1000); // Initial balance = 1000

        try
        {
            account.withdraw(1500); // Trying to withdraw more than balance
        } 
        catch (InsufficientFunds e)
        {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
