class Vehicle
{
           protected void run()
           {
                   System.out.println("Hello From Parent Class");
           }
}
class Bike2 extends Vehicle
{
          public void run()                                        //smaller scope can be convert to wider scope( protected (smaller) -> public (wider)) 
          {
                  System.out.println("Hello From Child Class");   
          }

          public static void main(String args[])
          {
                   Bike2 b2=new Bike2();
                   b2.run();              //calls child class method which override parent class run method
                                          //if child class cannot have method than call parent class method
          }
}