package bank;

public class Account
{
     int balance;
     int accountNumber;
  
     Account(int balance,int accountNumber)
     {
         this.balance=balance;
         this.accountNumber=accountNumber;
     }

     public void display()
     {
          System.out.println("Account Balance:" + balance);
          System.out.println("Account Number:" + accountNumber);
     }
}