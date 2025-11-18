class OuterPrivate
{
      private int accNo=12345678;
      private int accBalance=60000;   
      
      class InnerPrivate
      {
            void display()
            {
                   System.out.println("Account Number:" + accNo);
                   System.out.println("Account balance:" + accBalance);
            }
      }

      public static void main(String args[])
      {
             OuterPrivate p1=new OuterPrivate();
             OuterPrivate.InnerPrivate ip1= p1.new InnerPrivate();
             ip1.display();
      }
}
   