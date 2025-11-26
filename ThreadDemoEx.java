class ThreadDemoEx implements Runnable
{
       public void run()
       {
              System.out.println("Thread is Executing...");
       }

       public static void main(String args[])
       {
               ThreadDemoEx e1= new ThreadDemoEx();

               Thread t1=new Thread(e1);

               t1.start();
       }
}