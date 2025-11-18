class Employee
{
         int eid;
         String name;

         void EmployeeInfo(int eid,String name)
         {
               this.eid=eid;
               this.name=name;
               System.out.println("Employee ID:" +eid + " Employee Name:" +name);
         }
}
class FullTimeEmployee extends Employee
{
         int hour_rate=200;
         int work_hours=40;
         int total_week=52;
         int gross_salary;
        
         void FullTimeSalary()
         {
               int annual= hour_rate * work_hours * total_week;
               gross_salary=annual/12;
               System.out.println("FullTimeEMployee Salary:" + gross_salary);
         }
}  
class PartTimeEmployee extends FullTimeEmployee
{
           
          void PartTimeSalary()
          {
                 int annual= hour_rate * work_hours/2 * total_week; 
                 gross_salary=annual/12;
                 System.out.println("PartTimeEMployee Salary:" + gross_salary);
          }
}
class ActualSalary
{
         public static void main(String args[])
         {
                PartTimeEmployee p1=new PartTimeEmployee();
                p1.EmployeeInfo(101,"Ram");
                p1.FullTimeSalary();
                p1.PartTimeSalary();
         }
}        