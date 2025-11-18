class Library
{
       
      Library getA()
      {
             return this;
      }

      class Book
      {
             void show()
             {
                  System.out.println("Inner Class Method");
             }
      }

      public static void main(String args[])
      {
              Library l1=new Library();

              l1.getA().new Book().show();
      }
}  