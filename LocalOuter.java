class LocalOuter
{
         public void display()
         {
               
               class LocalInner
               {
                     void show()
                    {
                            System.out.println("Inner Class Method");
                    }
               }

              System.out.println("Outer Class Method");

              LocalInner i1=new LocalInner();
              i1.show();
          }

          public static void main(String args[])
          {
               LocalOuter o1 = new LocalOuter();
               o1.display();
          }
}