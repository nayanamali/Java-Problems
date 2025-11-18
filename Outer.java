//Inner Class in Java ( Member Class)
class Outer
{
       int a=10;
      
       void display()
       {
               System.out.println("Outer Class Method");
               System.out.println("Value of a:" + a);
       }

       class Inner
       {
               void show()
               {
                    System.out.println("Inner Class Method");
               }
       }

       public static void main(String args[])
       {
               Outer o=new Outer();
    
               Outer.Inner in = o.new Inner();          //Create object of inner class
 
               in.show();                               //to call inner class method
 
               o.display();
       }
}