class ThreadPro2 extends Thread
{
       public void run()
       {
             for(int i=0;i<10;i++)
             {
                   System.out.println(i);
                   try
                   {
                           Thread.sleep(1000);
                   }
                   catch(Exception e)
                   {
                           System.out.println(e);
                   }
             }

             System.out.println("Thread Executed");
       }
    
       public static void main(String args[])
       {
             ThreadPro2 d1=new ThreadPro2();
             ThreadPro2 d2=new ThreadPro2();
             d1.start();
             d2.start();
       }
}