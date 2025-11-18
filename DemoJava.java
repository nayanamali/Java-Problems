
class DemoJava
{
     public void answer(String str) 
     {
          if(str==null)
         {
               
                throw new NullPointerException("Length Not Found");
         }
         else
         {
               System.out.println("Length Found");
         }

     }

     public static void main(String args[])
     {
          DemoJava j1=new DemoJava();
          try 
          {
                j1.answer(null);
          }

          catch(NullPointerException e)
          {
                System.out.println(e);
          }
     }
}