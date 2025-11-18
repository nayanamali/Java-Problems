class Restaurant
{
      String name;
      String menu;
      private double rating;
      int deliveryTime;

      Restaurant(String name,String menu,int deliveryTime)
      {
           this.name=name;
           this.menu=menu;
           this.deliveryTime=deliveryTime;
      }

      void setRate(double rating)
      {
            this.rating=rating;
      }

      void display()
      {
      System.out.println("Name:" + name + "Menu:" + menu + " DeliveryTime:" + deliveryTime + "pm");
      }

      void getRate()
      {
            System.out.println(name + " rated " + rating);
      }

      public static void main(String args[])
      {
            Restaurant r1=new Restaurant("Ram","Pav-Bhaji",10);
            r1.setRate(4.5);
            r1.display();
            r1.getRate();
      }
}


     