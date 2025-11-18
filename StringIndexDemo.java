class StringIndexDemo
{
       public static void main(String args[])
      {

            String s="Hello";

            System.out.println("Exception Handling");

            try
            {
                   int i=10;
                   System.out.println(s.charAt(i));      //java.lang.StringIndexOutOfBoundsException: Index 10 out of bounds for length 5
            }

            catch(Exception e)
            {
                 System.out.println(e);
            }

             System.out.println("Rest of code");

      }
}