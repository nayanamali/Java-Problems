//we can use super keyword inside the instance method of child class to access data of parent class

class Parent
{
          String message="Happy Diwali";
}
class superDemo extends Parent
{
         String message="Everyone";
   
         void showMessage()
         {
                System.out.println(super.message);
                System.out.println(messaeege);
         }
   
         public static void main(String args[])
         {
                superDemo d1=new superDemo();
                d1.showMessage();
         }
}