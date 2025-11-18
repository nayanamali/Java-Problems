class Person
{
         String company_Name="Deloitte";
         String company_city="Pune";
}
class Employee extends Person
{
         int eid;
         String ename;
   
         void setinfo(int eid,String ename)
         {
              this.eid=eid;
              this.ename=ename;
         }
}
class Manager extends Employee
{
         int mid;
         String mname;
   
         void setminfo(int mid,String mname)
         {
              this.mid=mid;
              this.mname=mname;
         }
}
class multidemo
{    
        public static void main(String args[])
        {
                   Manager m1=new Manager();
                   m1.setinfo(101,"Ram");
                   m1.setminfo(107,"Shaym");
                   
                   System.out.println("Id:" +m1.eid + " Name:" +m1.ename + " MID:" + m1.mid + " Mname:" + m1.mname+ "Comapny_Name:" + m1.company_Name + " Comapny_city:" + m1.company_city); 
        }
}