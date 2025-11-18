//5. Return Current Class Instance

//Create a class Bike with a method getBike() that returns the current class instance using this
class Bike
{
     
        Bike getBike()
        {
                 return this;               //Return Current Class Instance
        }
 
        void message(String name)
        {
                System.out.println("Bike name: " + name);
        }
 
        public static void main(String args[])
        {
                new Bike().getBike().message("Royal Enfield");
        }
}