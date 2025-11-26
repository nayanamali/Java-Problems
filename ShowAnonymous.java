abstract class AnonymousDemo
{
        abstract void run();
}

class ShowAnonymous
{
      public static void main(String args[])
      {
            AnonymousDemo a1= new AnonymousDemo()
            {
                  void run()
                  {
                        System.out.println("Method Running ");
                  }
            };

           a1.run();
      }
}
