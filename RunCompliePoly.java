//Co-Variant Return type and Instance Of keyword

//In Compile time polymorphism (Method Overloading)
w :- A single Object of class Can exexcute methods and know which method of class to be executed
class polydemo12
{
      void display()
      {
          System.out.println("Method1");
      }
 
      void display(int i)
      {
          System.out.println("Method2:" + i);
      }
  
      public static void main(String args[])
      {
           polydemo12 d1=new polydemo12();
           d1.display();
           d1.display(12);
      }
}

//In Run time polymorphism(Method Overriding) :- Here We don't know which method of class to be executed whether of Parent class or child class
class polydemo12
{
      void display()
      {
          System.out.println("Method1");
      }
 
      void display(int i)
      {
          System.out.println("Method2:" + i);
      }
  
      public static void main(String args[])
      {
           polydemo12 d1=new polydemo12();
           d1.display();
           d1.display(12);
      }
}