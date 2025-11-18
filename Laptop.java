class Laptop{
 
           String processor;
           String ram;
   
           void powerOn()
           {
              	System.out.println("Turns the laptop on");
           }
    
          void powerOff()
           {
                System.out.println("Turns the laptop off"); 
           }
           public static void main(String args[])
           {
                  Laptop l1=new Laptop();
                  l1.processor="Intel i5";
                  l1.ram="8GB";
                  System.out.println(l1.processor + " " + " has " + l1.ram );
                  l1.powerOn();
                  l1.powerOff();
          }
}