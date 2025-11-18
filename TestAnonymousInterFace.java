interface A
{
      public void run();
}

class TestAnonymousInterFace
{
     public static void main(String args[])
     {
                A t1=new A()
                {
                     public void run()
                     {
                               System.out.println("Abstract class Method");
                     }
                };

                t1.run();
     }
}


//Imp:what is anonymous class and why we used it
//What is Inner Class & it's type
