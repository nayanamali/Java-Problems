//Runtime Exception

class ArithmaticException
{
    public static void main(String args[])
    {
               int a=10;
               int b=0;

               System.out.println("Exception Handling");
        
               try
               {
                     System.out.println(a/b);
               }

               catch(Exception e)
               {
                    System.out.println(e);  //java.lang.ArithmeticException: / by zero
               }

               System.out.println("Rest of code");
    }
}