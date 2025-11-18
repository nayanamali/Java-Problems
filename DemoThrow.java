class NegativeException extends Exception
{
          public NegativeException(String str)
          {
                  super(str);
          }
}

class DemoThrow
{
        public void userThrow(int a) throws NegativeException
        {
              if(a<0)
              {
                      throw new NegativeException("Number Can not be negative");
              }

              else
              {
                      System.out.println("Number is Positive");
              }
       }

       public static void main(String args[])
       {
              DemoThrow d1=new DemoThrow();
              try
              {
                     d1.userThrow(-5);
              }

              catch(NegativeException e)
              {
                     System.out.println(e);
              }
       }
}