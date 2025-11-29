class SynChronized
{
      void show(int num)
      {
             for(int i=1;i<=5;i++)
             {
                     System.out.println(i*num);
                     try
                     {
                          Thread.sleep(500);
                     }

                     catch(Exception e)
                     {
                          System.out.println(e);
                     }
             }
      }
}

class MyThread1 extends Thread
{
      SynChronized c;

      MyThread1(SynChronized c)
      {
            this.c=c;
      }

      public void run()
      {
            c.show(5);
      }
}

class MyThread2 extends Thread
{
      SynChronized c;

      MyThread2(SynChronized c)
      {
             this.c=c;
      }

      public void run()
      {
             c.show(10);
      }
}

class TestSync
{
     public static void main(String args[])
     {
           SynChronized s1 = new  SynChronized();
           
           MyThread1 t1=new MyThread1(s1);
           MyThread2 t2=new MyThread2(s1);

           t1.start();
           t2.start();
     }
} 