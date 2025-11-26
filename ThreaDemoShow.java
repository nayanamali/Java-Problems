class ThreadDemoShow implements Runnable
{
       public void run()
       {
               System.out.println("Thread Exceuting..");
       }

       public static void main(String args[])
       {
              ThreadDemoShow t1=new ThreadDemoShow();
              
              Thread t2=new Thread(t1,"Hello World");
 
              String str=t2.getName();

              System.out.println(str);

              t2.start();
      }
}