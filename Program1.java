class program1 
{
      int a;
      int b;
 
      program1(int a,int b)
      {
          this.a=a;
          this.b=b;
      }

      void show()
      {
            System.out.println("Value of a:" + a);
            System.out.println("Value of b:" + b);
      }

      public static void main(String args[])
      {
            program1  t1=new program1(10,20);
            t1.show();
      }
}
     