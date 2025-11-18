class Employee
{
        int id;
        String name;
        int bonus;
        int bonusrate;
        int salary;
        void bonus(int bonusrate,int dsalary)
        {
                System.out.println("Bonus Calculation");
        }   
}
class Manager extends Employee
{
        void bonus(int bonusrate,int msalary)
        { 
                  salary=msalary;
                  bonus=salary*bonusrate/100;
        }
        void ManagerBonus(int mid ,String mname)
        {
                  id=mid;
                  name=mname;
                  System.out.println(" Manager_ID: " + id + " Manager_Name: " +name + " Manager_Salary: " + salary + " Manager_Bonus : " + bonus);
        }
}
class Developer extends Manager
{
        void bonus(int bonusrate,int dsalary)
        {
                  salary=dsalary;
                  bonus=salary*bonusrate/100;
        }
        void DeveloperBonus(int did ,String dname)
        {
                  id=did;
                  name=dname;
                  System.out.println(" Developer_ID: " + id + " Developer_Name: " + name + " Developer_Salary: " + salary + " Developer_Bonus : " + bonus);
        }
}
class Intern extends Developer
{
        void bonus(int bonusrate,int isalary)
        {
                  salary=isalary;
                  bonus=salary*bonusrate/100;
        }
        void InternBonus(int iid ,String iname)
        {
                  id=iid;
                  name=iname;
                  System.out.println(" Intern_ID: " + id + " Intern_Name: " + name + " Intern_Salary: " + salary + " Intern_Bonus : " + bonus);
        }
}
class MainDisplay
{
         public static void main(String args[])
         {
                    Intern i1=new Intern();
                    i1.bonus(10,20000);
                    i1.bonus(20,50000);
                    i1.ManagerBonus(101,"Ram");
                    i1.bonus(15,30000);
                    i1.DeveloperBonus(105,"Shaym");
                    i1.bonus(10,10000);
                    i1.InternBonus(107,"Shweta");
          }
}
                    
                     
                     

       
       
         