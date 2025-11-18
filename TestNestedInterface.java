//Nested Interface Example

interface A
{
      public void show();

       interface B
       {
            public void msg();
       }
}

class TestNestedInterface implements A.B
{
       public void msg()
       {
             System.out.println("Nested Interface Example");
       }

       public static void main(String args[])
       {
            A.B obj1= new TestNestedInterface();
            obj1.msg();
       }
}