class staticOverride
{
      static void display()
      {
             System.out.println("Parent Static method");
      }
}
class overshow extends staticOverride
{
      static void display()
      {
            System.out.println("Child Static Method");
      }

      public static void main(String args[])
      {
            display();
      }
}