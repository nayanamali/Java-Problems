class FinallyDemo
{

      public static void main(String args[])
      {
            try
            {
                   String str=null;
                   System.out.println("Length of String : " + str.length());
            }

            catch(Exception e)
            {
                   System.out.println(e);
            }
         
            finally
            {
                   System.out.println("Exception Occur because progam tries to use object reference that currently Hold null value");
            }
      }
}  