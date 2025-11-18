class NumberFormatDemo
{
       public static void main(String args[])
      {

            String s="Hello";

            System.out.println("Exception Handling");

            try
            {
                   int no=Integer.parseInt(s);
                   System.out.println(no);      //java.lang.NumberFormatException: For input string: "Hello"
            }

            catch(Exception e)
            {
                 System.out.println(e);
            }

             System.out.println("Rest of code");

      }
}