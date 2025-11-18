abstract class ATM
{
     abstract void withdraw(int w);
     abstract void checkbalance();
     abstract void deposite(int d);
     abstract void transferMoney(int t);

     int w;
     int d;
     int t;
     int totalBalance;
     String bname;

     void displayBankName()
     {
                System.out.println(" ethod Display Bank name");
     }

     void printReceipt()
     {
                System.out.println("Print Receipt");
     }

}
class SbiDemo extends ATM
{
      int balance=10000;

      void displayBankName(String bname)
      {
           this.bname=bname;
      }

      void withdraw(int w)
      {
           this.w=w;
           System.out.println("Withdrawl Amount: " + w);
      }

      void deposite(int d)
      {
           this.d=d;
           System.out.println("Deposited Amount:" + d);
      }

      void checkbalance()
      {
          totalBalance=balance+d-w;
          System.out.println("Total Balance:" + totalBalance);
      }

      void transferMoney(int t)
      {
            this.t=t;
            System.out.println("Transfer Amount:" + t);
      }

      void printReceipt()
     {
                System.out.println("Bank name : " + bname + " Balance:" + balance + "WithDrawl Amount:" + w + " Deposited Amount:" + d + " TotalBalance : " + totalBalance + "Transfer Amount : " + t);  
     }
      public static void main(String args[])
      {
              SbiDemo s1=new SbiDemo();
              s1.displayBankName("SBI");
              s1.withdraw(1000);
              s1.deposite(5000);
              s1.checkbalance();
              s1.transferMoney(1000);
              s1.printReceipt();
      }
}
      
      
      