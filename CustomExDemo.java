class CustomExDemo
{
        int a;
        int b;
        CustomExDemo(int a,int b) throws Exception
        {
           this.a=a;
           this.b=b;
        }

        void display()
        {
                 if(a<0 || b<0)  
                {
                      throw new Exception("Number is Negative");
                }
               
                else
                {
                      System.out.println("Number is positive");
                }

        }

        public static void main(String args[])
        {
               CustomExDemo e1=new CustomExDemo(-5,-5);
             
               try
               {
                      e1.display();
               }

               catch(Exception e)
               {
                     System.out.println(e);
               }
        }
}
            