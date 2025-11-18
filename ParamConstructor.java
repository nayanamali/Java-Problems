class ParamConstructor
{
                  int a;
                  int b;
   
                  ParamConstructor(int no1,int no2)
                  {
                                a=no1;
                                b=no2;
                  }
 
                  void display()
                  {
                                System.out.println("Value of a:" +a);
                                System.out.println("Value of b:" +b);
                  }
 
                  public static void main(String args[])
                  {
                               ParamConstructor p1=new ParamConstructor(10,20);
                               p1.display();
                  }
} 