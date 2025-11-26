class runnable
{
      void display(int a,int b) 
      {
             if(a<0 && b<0)
             {
                  throw new ArithmeticException("Negative number allowed");
             }

             else
             {
                  System.out.println("Number is positive");
             }

      }

      public static void main(String args[])
      {
             runnable r1=new runnable();
   
             try
             {
                  r1.display(-5,-5);
             }

             catch(xception e)
             {
                   System.out.println(e);
             }
      }
}
        