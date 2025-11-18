//Custom Exception

class HelloException extends Exception
{
        public HelloException(String str)
        {
                super(str);
        }

}

class CustomExceptionDemo
{
        public static void main(String args[])
        {
               try
               {
                 throw new HelloException(" This is my Custom Exception");
               }

               catch(HelloException e)
               {
                       System.out.println(e);    //HelloException:  This is my Custom Exception
               } 
            
               System.out.println("Rest of code");
        }
}