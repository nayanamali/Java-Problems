class CalculatorDemo
{
   
        void add(int a,int b)
        {
                System.out.println("Addition of two integers:" + (a+b));
        }
        void add(int a,int b,int c)
        {
                System.out.println("Addition of two integers:" + (a+b+c));
        }
        void add(double a,double b)
        {
                System.out.println("Adddition of two double:" + (a+b));
        }

        public static void main(String args[])
        {
                CalculatorDemo d1=new CalculatorDemo();
                d1.add(10,20);
                d1.add(10,20,30);
                d1.add(10.00,20.00);
        }
}
