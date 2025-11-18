class ThrowinnerException
{
       public static void main(String args[])
       {
          try
          {
            try
              { 
                     int a=10/0;
                     System.out.println(a);
              }
              catch(Exception e)
              {
                  System.out.println(e);

                  throw new ArrayIndexOutOfBoundsException("Exception thrown from inner catch");
              }

          }
 
         catch(Exception e)
         {
               System.out.println(e);
         }

       }
}