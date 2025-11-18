class parent
{
       void show()
       {
             System.out.println("Parent Class...");
       }
}
class child extends parent
{
       void show2()
       {
            System.out.println("Child Class...");
       }
}
class singledemo
{
         public static void main(String args[])
         {
               child c1=new child();
               c1.show();
               c1.show2();
         }
}