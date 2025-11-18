class InterruptedException
{
     public static void main(String args[])
     {
               try
               {
                    Thread.sleep(1000);
               }
               
               catch(Exception e) 
               {
                     System.out.println(e);     //java.lang.ClassNotFoundException: com.sam.ram
               }
     }
}