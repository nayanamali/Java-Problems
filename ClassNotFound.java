//Comppile Time Exeception
class ClassNotFound
{
     public static void main(String args[])
     {
               try
               {
                    Class.forName("com.sam.ram");
               }
               
               catch(Exception e) 
               {
                     System.out.println(e);     //java.lang.ClassNotFoundException: com.sam.ram
               }
     }
}