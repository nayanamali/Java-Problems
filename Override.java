//Using same method name in Child Class present into parent class (Method Overriding) also known as polymorphism.
class PolyDemo
{
       void display()
       {
         System.out.println("Display Method Exexcuted..");
       }
}
class Override extends PolyDemo
{
       void display(int a)
       {
         System.out.println("Display Method Exexcuted in another class " +a);
       }

       public static void main(String args[])
      {
            Override o1=new Override();
            o1.display();
            o1.display(10);
      }
} 