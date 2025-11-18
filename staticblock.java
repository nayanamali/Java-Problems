class staticblock
{
            static int a;
      
            static
            {
                    System.out.println("Static block use to initialize static variable");
                    a=10;
            }

            public static void main(String args[])
            {
                 staticblock b1=new staticblock();
                 System.out.println("Value of a:" + a );
            }
}