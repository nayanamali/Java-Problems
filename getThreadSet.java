class memberClass extends Inner
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
                memberClass m1= new memberClass();

                memberClass.InnerClass i1 = memberClass.new memberClass();

                i1.display();
       }
}
          