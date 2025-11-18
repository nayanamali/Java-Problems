class A1
{
        A1()
        {
            System.out.println("Parent Constructor");
        }
}
class B1 extends A1
{
         B1()
         {
               System.out.println("Child Constructor");
         }
}
class condemo
{
          public static void main(String args[])
          {
                  B1 b=new B1();
          }
}