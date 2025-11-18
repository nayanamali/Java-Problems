class Payment
{
      int total;
      void processPayment()
      {
           System.out.println("Choose Process Payment");
      }
}
class CreditCardPayment extends Payment
{
      int Payment;
      int transaction;
      int discount;
      CreditCardPayment(int Payment,int transaction,int discount)
      {
          this.Payment=Payment;
          this.transaction=transaction;
          this.discount=discount;
      }
      void processPayment()
      {
           total=Payment+transaction-discount;
           System.out.println("Payment through Credit:" + total + "$");
      }
}
class DebitCardPayment extends Payment
{
      int Payment;
      int transaction;
      int discount;
      DebitCardPayment(int Payment,int transcation,int discount)
      {
          this.Payment=Payment;
          this.transaction=transaction;
          this.discount=discount;
      }
      void processPayment()
      {
           total=Payment+transaction-discount;
           System.out.println("Payment through Debit:" + total + "$");
      }
}
class UPIPayment extends Payment
{
      int Payment;
      int transaction;
      int discount;
      UPIPayment(int Payment,int transaction,int discount)
      {
          this.Payment=Payment;
          this.transaction=transaction;
          this.discount=discount;
      }
      void processPayment()
      {
           total=Payment+transaction-discount;
           System.out.println("Payment through UPI:" + total +"$");
      }
}
class testpayment12
{
      public static void main(String args[])
      {
              Payment p=new CreditCardPayment(300,40,10);
              p.processPayment();
              Payment p1=new DebitCardPayment(1000,100,100);
              p1.processPayment();
              Payment p2=new UPIPayment(500,50,20);
              p2.processPayment();
      }
}
    