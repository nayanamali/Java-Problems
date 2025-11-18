class thisdemo
{
          
           int a;

            thisdemo()
            {
                      System.out.println("Default Constructor");
            }
 
            thisdemo(int no1)
            {
                    this();
                    a=no1;
                    System.out.println("Parameterized Constructor:" + a);
            }
 
            public static void main(String args[])
            {
                       thisdemo t1=new thisdemo(10);
            }
}