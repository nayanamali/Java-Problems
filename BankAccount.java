class BankAccount
{
     int accountNumber;
     String holderName;
     double balance;

     BankAccount(int accountNumber,String holderName,double balance)
     {
           this.accountNumber=accountNumber;
           this.holderName=holderName;
           this.balance=balance;
     }

     void deposite(int amt)
     {
           balance = balance + amt;
     }

     void withdraw(int amt)
     {
           if(balance<amt)
          {
                System.out.println("Insufficient Funds");
          }
          else
          {
           balance = balance - amt;
          }
     }

     void showDetails()
     {
           System.out.println("Account Number : " + accountNumber + " Holder Name : " + holderName + " Balance : " + balance);

     }

     public static void main(String args[])
     {
            BankAccount b1 = new BankAccount(123456789,"Ram Patil",0);
            b1.deposite(500);
            b1.withdraw(1000);
            b1.showDetails();
           
     }
}