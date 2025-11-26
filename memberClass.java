class memberClass 
{
       int a;
       int b;

       memberClass(int a,int b)
       {
              this.a=a;
              this.b=b;
       }

       class InnerClass
       {
             void display()
             {
                    System.out.println("Value of a : " + a);
                    System.out.println("Value of b : " + b);
             }
       }

       public static void main(String args[])
       {
                memberClass m1= new memberClass(10,20);

                memberClass.InnerClass i1 = m1.new InnerClass();

                i1.display();
       }
}
          