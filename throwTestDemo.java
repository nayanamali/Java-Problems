class throwEx
{
     public void show(String str)
     {
             throw new NullPointerException();
     }
}
class throwTestDemo
{
      
     public static void main(String args[])
     {
             throwEx e1=new throwEx();

             try
             {
                  e1.show(null);
             }

             catch(NullPointerException e)
             {
                   System.out.println(e);
             }
      }
}
      
             