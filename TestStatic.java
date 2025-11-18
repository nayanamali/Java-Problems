//Static Method in Interface
//Interface is declared with interface keyword and it contains only non-abstract methods
//Interfcae contains Default methids,Static methods,private method

interface Drawable
{
      void draw();
     
      static int cube(int x)
      {
           return x*x*x;
      }

      default void display()
     {
          System.out.println("Default Method");
     }
}

class rectangle implements Drawable
{
       public void draw()
       {
             System.out.println("Start Drawing");
       }
}

class TestStatic
{
      public static void main(String args[])
      {
            Drawable d1=new rectangle();
     
            System.out.println("Cube:" + Drawable.cube(5));

            d1.draw();
       
            d1.display();
      }
}
             