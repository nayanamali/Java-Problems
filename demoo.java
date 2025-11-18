class over
{
       void display()
       {
             System.out.println("Parent Class Method");
       }
}
class over2 extends over
{
       void display()
       {
              super.display();
              System.out.println("Child Class Method");
       }
       public static void main(String args[])
       {
             over2 v2=new over2();
             v2.display();
       }
}
