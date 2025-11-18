class ConOverload
{
       
        int DefaultBalance;
        int initialDeposite;
        int accNo;
        String accHolder;
        ConOverload()
        {
                System.out.println("Default Balance: " + defaultBalance);
        }

        ConOverload(int initialDeposite)
        {
           this.initialDeposite=initialDeposite;   
        }

        ConOverload(int accNo,String accHolder)
        {
               this.accNo=accNo;
               this.accHolder=accHolder;
        }

        void display()
        {
               System.out.println("Default Balance : " + DefaultBalance);
               System.out.println("Initial Deposite : " + initialDeposite);
        }

        void details()
        {
               System.out.println("Account Number : " + accNo);
               System.out.println("Account Holder Name: " + accHolder);
        }
       public static void main(String args[])
       {
                  ConOverload c1=new ConOverload(1000);
                  ConOverload c2=new ConOverload(23456789,"Shyam");
                  c1.display();
                  c1.details();
       }
}
        

   