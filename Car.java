//Create a class Car with default and parameterized constructors, and display brand and model.

class Car
{
                    String brand;
                    String model;
 
                    Car(String brand,String model)
                    {
                             this.brand=brand;
                             this.model=model;
                    }
                
                    void display()
                    {
                          System.out.println("Brand: " + brand + " Model: " +model);
                    }

                    public static void main(String args[])
                    {
                            Car c2=new Car("Tata", "Nexon");
                            c2.display();
                   }
}