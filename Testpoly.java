class  Vehical
{
       void mileage(int mileage)
       {
            System.out.println("Display Mileage Of Each Vehical");
       }
}
class Car extends Vehical
{
      void mileage(int mileage)
      {
            System.out.println("Mileage of Car:" +  mileage + "Km/l");
      }
}
class Bike extends Vehical
{
      void mileage(int mileage)
      {
            System.out.println("Mileage of Bike:" +  mileage + "Km/l");
      }
}
class Truck extends Vehical
{
      void mileage(int mileage)
      {
            System.out.println("Mileage of Truck:" +  mileage + "Km/l");
      }
}

class Testpoly
{
           public static void main(String args[])
           {
                 Car c1=new Car();
                 c1.mileage(12);
                 Bike b1=new Bike();
                 b1.mileage(15);
                 Truck t1=new Truck();
                 t1.mileage(13);
           }
}