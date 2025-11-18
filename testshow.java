class Address1
{
         String city;
         String state;
         String country;
         
         Address1(String city,String state,String country)
         {
               this.city=city;
               this.state=state;
               this.country=country;
               
         }
}
class pdetail 
{
           int pid;
           String name;
           Address1 eaddress;
           pdetail(int pid,String name,Address1 eaddress)
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
                    Address1 a1=new Address1("Pune","Maharashta","India");
                   
                    pdetail p1=new pdetail(101,"Ram",a1);
                    System.out.println(p1.eaddress.city+" " +p1.eaddress.state +" " + p1.eaddress.country+" " + p1.pid +" " + p1.name);
              }
}
         
