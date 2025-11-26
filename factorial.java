class Factorial
{
      int num;
      int fact=1;
      Factorial(int num)
      {
          this.num=num;
      }

      void display()
      {
                for(int i=1;i<num;i++)
                {
                        fact+=fact*i;
                }

                System.out.println("factorial of Given number : " + fact);
      }

      public static void main(String args[])
      {
               Factorial f1 = new Factorial(5);
               f1.display();
      }
}
   
         