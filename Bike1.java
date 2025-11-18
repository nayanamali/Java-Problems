//method override:- when a same method of parent class can used into child class (by inheriting) (must have same [return type function_name (arguments)]) as present in parent class.
//it achieved through inheritance 
//if we define method in parent class in public scope then in child class Scope of method cam not be change or reduce (it become same access specifier as in parent class)
//public>protected>private
//Wider scope can not be minimize but small scope can be maximize 
//Even if we pass parameter to parent class method and does not pass parameter to child class method than both method can be treated as diffrent this is not method overriding

class Vehicle
{
           public void run()
           {
                   System.out.println("Hello From Parent Class");
           }
}
class Bike1 extends Vehicle
{
          private void run()                                      // private void run():- attempting to assign weaker access privileges; was public
          {
                  System.out.println("Hello From Child Class");   //run() in Bike1 cannot override run() in Vehicle
          }

          public static void main(String args[])
          {
                   Bike1 b1=new Bike1();
                   b1.run();              //calls child class method which override parent class run method
                                          //if child class cannot have method than call parent class method
          }
}