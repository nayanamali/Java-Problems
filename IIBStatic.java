class IIBStatic
{
            static int a;
            int b;
 
            static{           //class level ( It can be display when class loaded once)
                       System.out.println("Static Block initialize Static Variable");
                       a=10;
                  }
  
            {
                 System.out.println("Instance Block initialize instance Variable");   //it object level can be display multiple times as instance of class
                 b=20;
            }
 
            IIBStatic()
            {
                System.out.println("Value of Static int a:" + a);
                System.out.println("Value of instance int b:" + b);
                int add=a+b;
                System.out.println("Addition:" + add);
            }

            public static void main(String args[])
            {
                 IIBStatic i1=new IIBStatic();
                 IIBStatic i2=new IIBStatic();
            }
}