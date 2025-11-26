class StaticDemo
{
     static int a=10;
     static int b=20;

     static void display()
     {
         System.out.println("Outer Static Metthod");
     }

     static class StaticInner
     {
            void show()
            {
                    display();
                    System.out.println("value of a : " + a);
                    System.out.println("value of b : " + b);
            }
     }

     public static void main(String args[])
     {
           StaticDemo d1=new StaticDemo();
           
            StaticDemo.StaticInner i1= new  StaticDemo.StaticInner();

           i1.show();
     }
}

           
   