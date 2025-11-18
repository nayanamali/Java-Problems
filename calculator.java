class calculator
{
   
       int a;
       int b;

       calculator(int a,int b)
       {
           this.a=a;
           this.b=b;
       }
       void input()
       {
            System.out.println("Enter Value of a:" + a);
            System.out.println("Enter Value of b:" + b);
            this.displayResult();
       }
    
       void displayResult() 
       {
             int result=a+b;
             System.out.println("Addition of a & b: " + result);
       }

      public static void main(String args[])
      {
             
            calculator c1=new calculator(10,20);
           
            c1.input();
      }
}  