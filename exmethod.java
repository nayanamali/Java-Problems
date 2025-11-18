class exmethod{
 
           
             void sum()
             {
                     int a=10;
                     int b=20;
                     int sum=a+b;
                     System.out.println("Sum of two numbers:" + sum);
             }
             static void mult()
             {
                     int a=10;
                     int b=20;
                     int mult=a*b;
                     System.out.println("Multiplication of two numbers:" +mult);
             }
             public static void main(String args[])
             {
                    exmethod e1=new exmethod();
                    e1.sum();
                    mult();
             }
}  