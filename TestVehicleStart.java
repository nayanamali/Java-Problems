class VehicleStart
{
     void  start()
     {
            System.out.println(" Vehicle Started ");
     }

}

class Car extends VehicleStart
{
     void start()
     {
            System.out.println(" Car Started ");
     }
}

class Bike extends VehicleStart
{
     void start()
     {
            System.out.println(" Bike Started ");
     }
}

class ElectricScooter extends VehicleStart
{
     void start()
     {
            System.out.println(" ElectricScooter Started " );
     }
}

class TestVehicleStart
{
     public static void main(String args[])
     {
             Car c1=new Car();
             c1.start();
             Bike b1=new Bike();
             b1.start();
             ElectricScooter e1= new ElectricScooter();
             e1.start();
     }
}