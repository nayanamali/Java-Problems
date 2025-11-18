

public class AccountDemo
{
      private double balance;
      public double getBalance()
      {
             return balance;
      }

      public double DepositeAmt(double amount)
      {
              if(amount>0)
              {
              balance=balance+amount;
              }
              return balance;
      }

      public double WithDrawlAmt( double amount)
      {
             if(amount > 0 && amount < balance )
             {
                 balance=balance+amount;
             }
             return balance;
      }
  
}
  
      
      