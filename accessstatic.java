class accessstatic
{
         static int a=10;
          
         int b=20;
     
          static void display()
          {
                 System.out.println("Value of static variable a:" +a);
          }
          void show()
          {
                System.out.println("value of instance variable b:" +b);
          }
          public static void main(String args[])
          {
                    accessstatic a1=new accessstatic();
                    display();
                    a1.show();
          }
}