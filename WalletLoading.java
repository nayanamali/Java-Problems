class WalletLoading
{
      void  makePayment(int CreditNo,double Amount)
      {
             int Credit=CreditNo;

             System.out.println("Payment Through Credit card : " + " Credit card No : " + Credit  + " Payment: " + Amount);
      }

      void makePayment(int upiPin,int SentMoney)
      {
             int upi=upiPin;
             int Money=SentMoney;
             
             System.out.println("Payment Through UPI : " + " UPI No : " + upi  + " Payment: " + Money);
      }

      void makePayment(int AccNo,String accName,String BankName,int transferMoney)
      {
              int No=AccNo;
              String Name=accName;
              String Bank=BankName;
              int transfer=transferMoney;

              System.out.println("Payment Through NetBanking card : " + "Account No: " + No  + " accName: " +Name + " BankName : " + Bank + " Payment : " + transfer);
      }

      void makePayment(int Amount)
      {
              int amt=Amount;

              System.out.println("Payment Through Wallet : " + " Payment: " + amt);

      }

       public static void main(String args[])
      {
              WalletLoading w1=new WalletLoading();
              w1.makePayment(101203403,1200.00);
              w1.makePayment(234567,5000);
              w1.makePayment(123456789,"Ram","SBI",1000);
              w1.makePayment(3000);
       }
}
       