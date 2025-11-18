abstract class TrackOrder
{
         abstract void deliveryPartner();
         abstract void ArrivalTime();
         abstract void mapUpdate();

         void trackDelivery()
         {
              System.out.println(" Traking Your Delivery......");
              deliveryPartner();
              ArrivalTime();
              mapUpdate();
              System.out.println(" Order has been successfully Deliverd");
              System.out.println();
         }
}

class FirstOrder extends TrackOrder
{
        void deliveryPartner()
        {
             System.out.println(" Ram is your Delivery Partner Name");
        }

        void ArrivalTime()
        {
             System.out.println(" Delivery Arrival Time is 10 min ETA");
        }

        void mapUpdate()
        {
             System.out.println(" Upadte Your Map after 10 min to track your Order");
        }
}

class SecondOrder extends TrackOrder
{
        void deliveryPartner()
        {
             System.out.println(" Hitesh is your Delivery Partner Name");
        }

        void ArrivalTime()
        {
             System.out.println(" Delivery Arrival Time is 20 min ETA");
        }

        void mapUpdate()
        {
             System.out.println(" Upadte Your Map after 5 min to track your Order");
        }
}

class TestOrder
{
        public static void main(String args[])
        {
              FirstOrder f1=new FirstOrder();
              f1.trackDelivery();
              SecondOrder s2=new SecondOrder();
              s2.trackDelivery();
        }
}