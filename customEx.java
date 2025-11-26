class customEx extends Exception
{
      public void show(int a) throws customEx
      {
           int no=a/10;
    
           throw new ArithmeticException("Number cannot be divided by zero");
      }

      public static void main(String args[])
      {
            customEx x1=new customEx();

            try
            {
                x1.show(10);
            }

            catch(customEx e)
            {
                System.out.println(e);
            }
      }
}