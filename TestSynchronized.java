class synchronizeBlock
{
         void display()
         {
                 synchronized(this)
                {
                 System.out.println("Synchronized Block");
                   
                    for(int i=0;i<=2;i++)
                    {
                          System.out.println("Synchronized Task : " + i);
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

                System.out.println("Unsychronized Block");
                
                for(int i=0;i<=2;i++)
                {
                         System.out.println("UnSynchronized Task : " + i);
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

class MyThread extends Thread
{
        synchronizeBlock s;

        MyThread(synchronizeBlock s)
        {
             this.s=s;
        }

        public void run()
        {
             s.display();
        }
}

class TestSynchronized
{
        public static void main(String args[])
        {
             synchronizeBlock obj = new synchronizeBlock();
             MyThread t1 = new MyThread(obj);
             MyThread t2= new MyThread(obj);
             t1.start();
             t2.start();
        }
}
                      