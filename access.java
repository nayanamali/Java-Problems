class access
{
       static int a=10;
    
       int b=20;

       static void display()
       {
         System.out.println("Static method demo");
       }
       public static void main(String args[])
       {
               access a1=new access();
               System.out.println("Value of a:" + a);
               System.out.println("Value of b:" +a1.b);
               display();
       }
}
  
       