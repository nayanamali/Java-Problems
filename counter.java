class counter
{
             static int count=0;
      
             void count()
             {
                    count++;
                     System.out.println("Number of objects created:" + count);
             }

             public static void main(String args[])
             {
                    counter c1=new counter();
                    counter c2=new counter();
                    counter c3=new counter();
                    c1.count();
                    c2.count();
                    c3.count();
             }
}
                    