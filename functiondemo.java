class functiondemo{
 
           void result(int a,int b)
           {
                  System.out.println("Value of a: " +a);
                  System.out.println("Value of b: " +b);
                  System.out.println("Addition of a & b: " + (a+b));
                  System.out.println("Subtraction of a & b: " +(a-b));
                  System.out.println("Multiplication of a & b: " +(a*b));
                  System.out.println("Division of a & b: " +(a/b));
                  System.out.println("Modulus of a & b: " +(a%b));
           }
           public static void main(String args[])
           {
                   functiondemo f1=new functiondemo();
                   int no1=20;
                   int no2=10;
                   f1.result(no1,no2);
           }
}