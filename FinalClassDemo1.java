class FinalClassDemo
{
         void display()
         {
             System.out.println("Final Method of parent class");
         }
}
class FinalClassDemo1 extends FinalClassDemo
{
         void display()
         {
             System.out.println("Final Method of child class");
         }

         public static void main(String args[])
         {
                FinalClassDemo1 d1=new FinalClassDemo1();
                d1.display();
         }
}