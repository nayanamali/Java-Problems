class alluses
{
      String message="Parent Class Variable";

      void show()
      {
          System.out.println("Parent class method");
      }

      alluses()
      {
          System.out.println("Parent class Constructor");
      }

      alluses(int a)
      {
         System.out.println("value of a:"+ a);
      }
}
class displayUse extends alluses
{
      String message="Child Class variable";
 
      void printMessage()
      {
         System.out.println(super.message);
         System.out.println(message);
      }

      void show()
      {
          super.show();
          System.out.println("Child Class Method");
      }
 
      displayUse()
      {
          super();
          System.out.println("Child Class Constructor");
      }
       
      displayUse(int b)
      {
          super(10);
          System.out.println("value of b:" + b);
      }

      public static void main(String args[])
      {
             displayUse u1=new displayUse(20);
             u1.printMessage();
             u1.show();
      }
}