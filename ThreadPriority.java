class ThreadPriority extends Thread
{
        public void run()
        {
               System.out.println(Thread.currentThread().getName());
        }

        public static void main(String args[])
        {
               ThreadPriority t1=new ThreadPriority();
               ThreadPriority t2=new ThreadPriority();

               System.out.println("Priority of Thread 1 : " + t1.getPriority());
               System.out.println("Priority of Thread 2 : " + t2.getPriority());
 
               t1.setPriority(10);
               t2.setPriority(5);

               System.out.println("Priority of Thread 1 : " + t1.getPriority());
               System.out.println("Priority of Thread 2 : " + t2.getPriority());

               System.out.println(Thread.currentThread().getName());
       }
}

               