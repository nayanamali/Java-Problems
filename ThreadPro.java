/*class ThreadPro extends Thread
{
         public void run()
        {
              System.out.println("Thread is running...");
        }
  
        public static void main(String args[])
        {
               ThreadPro p1 = new ThreadPro();
               p1.start();
        }
}*/

class ThreadPro implements Runnable
{
         public void run()
        {
              System.out.println("Thread executed...");
        }
  
        public static void main(String args[])
        {
               ThreadPro p1 = new ThreadPro();
               Thread t1= new Thread(p1);
               t1.start();
        }
}