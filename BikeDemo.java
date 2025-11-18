//Super() mrthod is used to call Constructor of parent class through child class Constructor

//If we want to  execute parent class constructor than we can use super() method inside child class Constructor
//It Forms Constructor Chaining

class vehical
{
          int chesisno;
          String vehicalType;
    
          vehical (int chesisno,String vehicalType)
          {
                   this.chesisno=chesisno;
                   this.vehicalType=vehicalType;
          }
}

class BikeDemo extends vehical
{
         String color;
     
         BikeDemo(int chesisno,String vehicalType,String color)
         {
                    super(chesisno,vehicalType);
                    this.color=color;
         }

         void show()
         {
               System.out.println("ChesisNo:" + super.chesisno + " VehicalType:" + super.vehicalType + " Color: " + color);
         }

         public static void main(String args[])
         {
                  BikeDemo b1=new BikeDemo(101,"Bike","Black");
                  b1.show();
         }
}



