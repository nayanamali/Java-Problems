class Address
{
     
        String city,state,country;

        Address(String city,String state,String country)       
        {
               this.city=city;
               this.state=state;
               this.country=country;
        }
}
class Employee
{
           int eid;
           String ename;
           Address eaddress;

           Employee(int id,String ename,Address eaddress)
           {
                  this.eid=eid;
                  this.ename=ename;
                  this.eaddress=eaddress;
           }
 
           void display()
           {
                    System.out.println(eid + " " +ename);
                    System.out.println(eaddress.city + " " + eaddress.state + " " + eaddress.country);
           }
}
class TestAgree
{
          public static void main(String args[])
          {
                  Address a1=new Address("Pune","Maharashtra","India");
                  Employee e1=new Employee(101,"Ram");
 
                  e1.display();
          }
}