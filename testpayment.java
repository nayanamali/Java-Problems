class Payment
{
      void processPayment()
      {
           System.out.println("Choose Process Payment");
      }
}
class CreditCardPayment extends Payment
{
      int Payment;
      CreditCardPayment(int Payment)
      {
          this.Payment=Payment;
      }
      void processPayment()
      {
           System.out.println("Payment through Credit:" + Payment + "$");
      }
}
class DebitCardPayment extends Payment
{
      int Payment;
      DebitCardPayment(int Payment)
      {
          this.Payment=Payment;
      }
      void processPayment()
      {
           System.out.println("Payment through Debit:" + Payment + "$");
      }
}
class UPIPayment extends Payment
{
      int Payment;
      UPIPayment(int Payment)
      {
          this.Payment=Payment;
      }
      void processPayment()
      {
           System.out.println("Payment through UPI:" + Payment +"$");
      }
}
class testpayment
{
      public static void main(String args[])
      {
              Payment p=new CreditCardPayment(300);
              p.processPayment();
              Payment p1=new DebitCardPayment(1000);
              p1.processPayment();
              Payment p2=new UPIPayment(500);
              p2.processPayment();
      }
}
    