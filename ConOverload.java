class ConOverload
{
       
        double DefaultBalance;
        int initialDeposite;
        int accNo;
        String accHolder;
        ConOverload(double dbalance)
        {
                DefaultBalance=dbalance;
                System.out.println("Default Balance: " + DefaultBalance);
        }

        ConOverload(int initialDeposite)
        {
           this(500.00);
           this.initialDeposite=initialDeposite;   
        }

        ConOverload(int accNo,String accHolder)
        {
               this.accNo=accNo;
               this.accHolder=accHolder;
        }

        void display()
        {
               System.out.println("Initial Deposite : " + initialDeposite);
        }

        void details()
        {
               System.out.println("Account Number : " + accNo);
               System.out.println("Account Holder Name: " + accHolder);
        }

        void FinalBalance()
        {
                 double finalBalance=DefaultBalance+initialDeposite;
                
                 System.out.println("Total balance: " + finalBalance);
        }

       public static void main(String args[])
       {
                  ConOverload c1=new ConOverload(1000);
                  ConOverload c2=new ConOverload(23456789,"Shyam");
                  c1.display();
                  c2.details();
                  c1.FinalBalance();
       }
}
        

   