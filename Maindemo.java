class vehicleDemo
{
           String type="Car";
           
           void showType()
          {
                  System.out.println("Vehicle Type is " + type);
          }
}
class Car1 extends vehicleDemo
{
          String brand="Maruti Suzuki";
    
          void showBrand()
          {
                  System.out.println(type + " is a brand of " + brand);
          }
}
class Maindemo
{
          public static void main(String args[])
          {
                   Car1 c1=new Car1();
                   c1.showType();
                   c1.showBrand();
          }
}