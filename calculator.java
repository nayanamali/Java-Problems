class calculator
{
      void add(int a,int b)
      {
              System.out.println("Addition of two Integer Number : " + (a + b ));
      }

      void add(double a,double b)
      {
              System.out.println("Addition of two Double Number : " + (a + b ));
      }

      void add(int a,int b ,int c)
      {
              System.out.println("Addition of Three Integer Number : " + (a + b + c));
      }

      public static void main(String args[])
      {
              calculator c1 = new calculator();
              c1.add(10,20);
              c1.add(25.10,20.10);
              c1.add(10,20,30);
      }
}