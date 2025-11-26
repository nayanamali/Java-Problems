class startDouble extends Thread
{
      public void run()
      {
              for(int i=0;i<5;i++)
              {
                  try 
                  {
                           Thread.sleep(500);
                  }
                  catch(Exception e)
                  {
                           System.out.println(e);
                  }

                System.out.println(i);
             }
                     
      }
  
      public static void main(String args[])
      {
            startDouble st1=new startDouble();
            startDouble st2=new startDouble(); 
            st1.run();
            st1.run();
            System.out.println("Using Thread");        
            st1.start();
            st2.start();
      }
}