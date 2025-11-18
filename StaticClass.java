//Static Inner Class : - A class that is declare by using Static keyword inside a class Known as Static Inne Class 
//It can be used to access Static data members & methods of outer class inside static Inner class.


class StaticClass
{
      static int a=10;

      static void show()
      {
              System.out.println("Static Outer Class Method");
      }

      static class Inner
      {
               void InnerShow()
               {
                       show();
                       System.out.println("Static variable a : " + a);
                       System.out.println("Static Inner class Method");
               }
      }

      public static void main(String args[])
      {
             StaticClass.Inner i1= new StaticClass.Inner();
             i1.InnerShow();
      }
}