class Vehicle
{
     String brand;
     String speed;

     void setInfo(String brand,String speed)
     {
          this.brand=brand;
          this.speed=speed;
     }

     void displayInfo()
     {
              System.out.println("Display Vehicle Info");
     }

}

class Car extends Vehicle
{
       int Seats;

       void setInfo2(int Seats)
       {
             this.Seats=Seats;
       }

       void displayInfo()
       {
              System.out.println("Brand : " + brand + " Speed : " + speed + " Seats : " + Seats);
       }

       public static void main(String args[])
       {
             Car c1 = new Car();
             c1.setInfo("SSC Tuatara","282.9 mph");
             c1.setInfo2(2);
             c1.displayInfo();
       }
} 
      