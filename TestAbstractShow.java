abstract class Bank
{
      abstract int getInterestRate();
}
class SBI extends Bank
{
      int getInterestRate()
      {
           return 8;
      }
}
class HDFC extends Bank
{
      int getInterestRate()
      {
           return 9;
      }
}
class CBI extends Bank
{
       int getInterestRate()
       {
            return 10;
       }
}
class TestAbstractShow
{
       public static void main(String args[])
       {
            Bank b1=new SBI();
            System.out.println("SBI InterestRate:" + b1.getInterestRate() + " %");
      
            b1=new HDFC();
            System.out.println("SBI InterestRate:" + b1.getInterestRate() + " %");
 
            b1=new CBI();
            System.out.println("SBI InterestRate:" + b1.getInterestRate() + " %");
       }
}


      
