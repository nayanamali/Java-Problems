class InterThread
{
       double amount=10000;

       synchronized void withdraw(int amount)
       {
           System.out.println("Going to withdraw");

           if(this.amount<amount)
           {
                 System.out.println("Less Balance...");

                 try
                 {
                      wait();
                 }

                 catch(Exception e)
                 {
                      System.out.println(e);
                 }
           }

                    this.amount -= amount;

                    System.out.println("Amount Successfully WithDrawl");
           
      }

      synchronized void deposite(int amount)
      {
           System.out.println("Amount Start to deposite...");
          
           this.amount += amount;
 
           System.out.println("Amount Successfully Deposited...");

           notify();
      }

}

class TestInterThread
{
      public static void main(String args[])
      {
            final InterThread t1 = new InterThread();
           
            new Thread()
            {
                  public void run()
                  {
                         t1.withdraw(15000);
                  }
            }.start();

            new Thread()
            {
                  public void run()
                  {
                         t1.deposite(10000);
                  }
            }.start();
       }
}

          
                 