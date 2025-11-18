class vehicle
{
      void start()
      {
             System.out.println("Vehicle Starts");
      }
}
class car extends vehicle
{
      void start()
      {
             System.out.println("Car Starts...");
      }
}
class overdemo
{
      public static void main(String args[])
      {
              car c1=new car();
              c1.start();
      }
}
