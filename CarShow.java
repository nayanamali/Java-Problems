class Engine
{
      cdemo car;

      Engine(cdemo car)
      {
          this.car=car;
      }
    
      void display()
      {
          System.out.println("Current object value:" + car.data);
      }
}
class cdemo
{
       int data=10;
       cdemo()
       {
           Engine e1=new Engine(this);
           e1.display();
       }

       public static void main(String args[])
       {
           cdemo c1=new cdemo();
       }
}
        