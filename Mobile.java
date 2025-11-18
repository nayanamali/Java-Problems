class Mobile{
 
           String brand;
           String model;
           String color;
   
           void powerOn()
           {
              	System.out.println("Switches the phone on");
           }
    
          void powerOff()
           {
                System.out.println("Switches the phone off"); 
           }
           public static void main(String args[])
           {
                  Mobile m1=new Mobile();
                  m1.brand="Samsung";
                  m1.model="Galaxy M32";
                  m1.color="blue";
                  System.out.println( m1.brand + " " + " has " + m1.model + " with color " + m1.color);
                  m1.powerOn();
                  m1.powerOff();
          }
}