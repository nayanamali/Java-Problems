class House
{
       class Kitchen
       {
               int burners;
               String Utensils;
        
               Kitchen(int burners,String Utensils)
               {
                    this.burners=burners;
                    this.Utensils=Utensils;
               }

               void display()
               {
                    System.out.println("Burners:" + burners);
                    System.out.println("Utensils:" + Utensils);
               }

               void cook()
               {
                    System.out.println("Cooked Food");
               }
         }

         class Bedroom
         {
               int beds;
               String bedType;

               Bedroom(int beds,String bedType)
               {
                    this.beds=beds;
                    this.bedType=bedType;
               }
          
               void show()
               {
                    System.out.println("beds:" + beds);
                    System.out.println("bedType:" + bedType);
               }

               void sleep()
               {
                       System.out.println("Sleeping to bed");
               }
         }

         public static void main(String args[])
         {
                House h1=new House();
                
                House.Kitchen k1= h1.new Kitchen(5,"Oven");
    
                k1.display();
                k1.cook();

                House.Bedroom b1=h1.new Bedroom(3,"Sleep");
          
                b1.show();
                b1.sleep();
          }
}
