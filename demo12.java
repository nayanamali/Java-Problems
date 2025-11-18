class Account
{
       double balance;
       void deposite(double amt)
       {
           balance+=amt;
       }
       void withdrawl(double amt)
       {
           balance-=amt;
       }
       void currentbalance()
       {
             System.out.println("Current Balance:" + balance);
       }
}
class SavingAccount extends Account
{
        
        void addInterest(double intersetrate)
        {
              double interset= balance*intersetrate;
              balance=interset+balance;
              System.out.println("New Balance:" + balance);
        } 
}
class CurrentAccount extends Account
{
         double minbalance=500;
 
         void displaymin()
         {
         if(balance<minbalance)
         {
               System.out.println("Warning!! Low Balance");
         }
         }
}
class demo12
{
         public static void main(String args[])
         {
              SavingAccount s1=new SavingAccount();
              s1.deposite(1000.00);
              s1.withdrawl(500.00);
              s1.currentbalance();
              s1.addInterest(0.05);

              CurrentAccount a1=new CurrentAccount();
              a1.deposite(900.00);
              a1.withdrawl(500.00);
              a1.currentbalance();
              a1.displaymin();
         }
}
               