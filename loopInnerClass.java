class loopInnerClass
{
      int id;
      String name;

      loopInnerClass(int id,String name)
      {
                        this.id=id;
                        this.name=name;
      } 
      void display()
      {
           for(int i=0;i<5;i++)
           {
                
                class loopClass
                {
                   void show()
                   {
                          System.out.println("Id of Student : " + id);
                          System.out.println("Name of Student: " + name);
                   }
                }

            loopClass c1=new loopClass();
            c1.show();
           }

      }
      public static void main(String args[])
      {
             loopInnerClass l1=new loopInnerClass(101,"Ram");
             l1.display();
      }
}