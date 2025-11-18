class StaticException
{
        static int a;
        
        static
        {
            a=10/0;    
        }
     
        public static void main(String args[])
        {
              try
              { 
                    System.out.println("Value of a:" + a);
              }

              catch(Exception e)
              {
                    System.out.println(e);
              }
        }
}
                      