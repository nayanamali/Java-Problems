class Address1
{
         String city;
         String state;
         String country;
         
         Address eaddress;
         person(String city,String name,String Country)
         {
               this.staate=state;
               this.city=city;
               this.country=country;
               
         }
}
class pdetail extends Address1
{
           int pid;
           String name;
           Address eaddress;
           pdetail(int pid,String name,Address eaddress)
           {
               this.pid=pid;
               this.name=name;
               this.eaddress=eaddress;
           }
}
class testshow
{
               public static void main(String args[])
               {
                    Address1 a1=new address1("Pune","Maharashta","India");
                   
                    pdetail p1=new pdetail(101,"Ram",a1);
                    System.out.println(p1.city+" " +p1.state +" " + p1.country+" " + p1.pid +" " + p1.name);
              }
}
         
