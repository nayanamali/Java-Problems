interface myInterface
{
      default void show()
      {
          printDetails();
          System.out.println(" Show Message");
      }

      default void display()
      {
          printDetails();
          System.out.println(" Display Information");
      }

      private void printDetails()
      {
          System.out.println(" Print Details ");
      }
}
class printInterface implements myInterface
{
     
}

class TestInterface
{
      public static void main(String args[])
      {
           printInterface p1=new printInterface();
           p1.show();
           p1.display();
      }
}