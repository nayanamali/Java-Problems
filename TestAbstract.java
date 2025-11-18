//Static method can provide same functionality throughout program
//If a method is default than it provide constant Functionality throught the Program
//if we want to access method Directly through interface or abstract class than it can be done through static method 
abstract class AbstractDemo
{
      abstract void display();

      void show()
      {
          System.out.println(" Non Abstract Method");
      }

}

class TestAbstract extends AbstractDemo
{
      void display()

      {
            System.out.println("Abstract Methods");
      }

      public static void main(String args[])
      {
            AbstractDemo a1=new TestAbstract();
            a1.display();
            a1.show();
     }
}