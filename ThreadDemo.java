class ThreadDemo extends Thread
{
          pulic void run()
          {
                 System.out.println("Thread is Running....");
          }

          public static void main(String args[])
          {
                  ThreadDemo d1=new ThreadDemo();
                  d1.start();
          }
}