class parameter{
  
                      int a;
                      int b;
                      int mult;
                      parameter(int no1,int no2)
                      {
                             a=no1;
                             b=no2;
                             mult=a*b;
                      }
                      void display()
                      {
                             System.out.println("Value of a : " + a);
                             System.out.println("Value of b : " + b);
                             System.out.println("Multiplication of a & b:" +(a*b));
                      }
                      public static void main(String args[])
                      {
                             parameter p1=new parameter(10,20);
                             p1.display();
                      }
}
                       