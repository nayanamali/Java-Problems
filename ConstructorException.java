class CustomException
{
       int a;
       int b;
       ConstructorException(int a,int b) throws Exception
       {
             if(b<0 || a<0)
            {
                 throw new Exception(" Invalid Initialization: Naegative numbers are not alloweded");
            }

            this.a=a;
            this.b=b;
       }

       void display()
       {
             System.out.println("Value of a : " + a);
             System.out.println("Value of b : " + b);
       }

       public static void main(String args[])
       {
             try
             {
                    ConstructorException c1= new ConstructorException(-5,-10);
                    c1.display();
             }

             catch(Exception e)
             {
                     System.out.println(e);
             }
        }
}
                    