//Runtime Exception

class NullPointerException
{
        public static void main(String args[])
        {
              String s=null;

              System.out.println("Exception Handling");
        
               try
               {
                     System.out.println(s.length());
               }

               catch(Exception e)
               {
                    System.out.println(e);    // java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
               }

               System.out.println("Rest of code");  
       }
}