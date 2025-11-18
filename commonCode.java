class commonCode
{
           String message;
           int x=10;
          
          {
                message="Hello!";
          
          }
       
          commonCode()
          {
                   System.out.println("First Constructor says:" + message);
           }

          commonCode(int x)
          {
                  x=x;
                  System.out.println("Second Constructor says:" + message + x);
          }

          commonCode(int a,int b)
          {
                   System.out.println("Third Parameterized Constructor says:" + message);
                   int add=a+b;
                   System.out.println("Addition:" + add);
          }
  
          public static void main(String args[])
          {
                   commonCode c1=new commonCode();
                   commonCode c2=new commonCode(30);
                   commonCode c3=new commonCode(10,20);
          }
}