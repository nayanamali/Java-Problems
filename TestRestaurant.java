class restaurantCafe
{
      String name;
      String location;
      String menu;
      void CalculateDeliveryCharge(int Charges)
      {
           System.out.println("Calculate DeliveryCharges");
      }
  
}

class FastFoodRestaurant extends restaurantCafe
{ 
      String foodSupply;
      int totalAmt;
      int Charges;
      int deliveryAmt;
      FastFoodRestaurant(String name,String location,String menu,int deliveryAmt,String foodSupply)
      {
              this.name=name;
              this.location=location;
              this.menu=menu;
              this.deliveryAmt=deliveryAmt;
              this.foodSupply=foodSupply;
      }
  
      void CalculateDeliveryCharge(int Charges)
      {
             this.Charges=Charges;
             totalAmt=deliveryAmt+Charges;
      } 
      void restau()
      {
            System.out.println(" Name: " + name + " Location: " + location + " Menu: " + menu + " Food Will By Supply by " + foodSupply);
      }
      void displayAmt()
      {
            System.out.println(" Delivery Amount: " + deliveryAmt + " Charges:" + Charges + " Total Amount:" + totalAmt);
            System.out.println();
      }
}

class FineDiningRestaurant extends restaurantCafe
{
      int bookedTable;
      int totalAmt;
      int Charges;
      int deliveryAmt;
      FineDiningRestaurant(String name,String location,String menu,int deliveryAmt,int bookedTable)
      {
              this.name=name;
              this.location=location;
              this.menu=menu;
              this.deliveryAmt=deliveryAmt;
              this.bookedTable=bookedTable;
      }

      void CalculateDeliveryCharge(int Charges)
      {
             this.Charges=Charges;
             totalAmt=deliveryAmt+Charges;
      } 

      void fineDine()
      {
            System.out.println(" Name: " + name + " Location: " + location + " Menu: " + menu + " Booked Table: " + bookedTable);
      }

      void displayAmt()
      {
            System.out.println(" Delivery Amount: " + deliveryAmt + " Charges:" + Charges + " Total Amount:" + totalAmt);
            System.out.println();
      }
}    

class Cafe extends restaurantCafe
{
      int bookedTable;
      int totalAmt;
      int Charges;
      int deliveryAmt;
      Cafe(String name,String location,String menu,int bookedTable,int deliveryAmt)
      {
              this.name=name;
              this.location=location;
              this.menu=menu;
              this.deliveryAmt=deliveryAmt;
              this.bookedTable=bookedTable;
      }

      void CalculateDeliveryCharge(int Charges)
      {
             this.Charges=Charges;
             totalAmt=deliveryAmt+Charges;
      }
 
      void fineCafe()
      {
            System.out.println(" Name: " + name + " Location: " + location + " Menu: " + menu + " Booked Table: " + bookedTable);
      }
 
      void displayAmt()
      {
            System.out.println(" Delivery Amount: " + deliveryAmt + " Charges:" + Charges + " Total Amount:" + totalAmt);
            System.out.println();
      }
}  

class TestRestaurant
{
      public static void main(String args[])
     {
           FastFoodRestaurant f1=new FastFoodRestaurant("FastFood Restaurant","Pimpri-Chinchwad","Pav-Bhaji",500,"Drive Through");
           f1.restau();
           f1.CalculateDeliveryCharge(0);
           f1.displayAmt();
           FineDiningRestaurant f2=new FineDiningRestaurant("FineFood Restaurant","Hinjewadi","Sandwitch",250,2);
           f2.fineDine();
           f2.CalculateDeliveryCharge(100);
           f2.displayAmt();
           Cafe c1=new Cafe("Chai Cafe","Baner","Coffee",1,200);
           c1.fineCafe();
           c1.CalculateDeliveryCharge(50);
           c1.displayAmt();
     }
}
           
      