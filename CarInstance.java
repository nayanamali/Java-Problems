class CarInstance
{
       private int VIN=123451;

       class Engine
       {
                void display()
               {
                System.out.println("Verification Identification Number : " + VIN);
               }
       }

       public static void main(String args[])
       {
             CarInstance c1=new CarInstance();
             CarInstance.Engine e1=c1.new Engine();
             e1.display();
       }
}
       