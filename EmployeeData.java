class EmployeeData
{
     int empid;
     String name;
     double monthsalary;
     double annual;
     EmployeeData(int empid,String name,double monthsalary) 
     {
            this.empid=empid;
            this.name=name;
            this.monthsalary=monthsalary;
     }
     void YearSalary()
     {
           annual=monthsalary*12;
     }
 
     void display()
     {
              System.out.println("ID:" +empid+ " Name: " + name + " monthlysalary:" + monthsalary + " CTC:" + annual);
     } 
     public static void main(String args[])
     {
            EmployeeData E1=new EmployeeData(101,"Ram",38000.00);
            E1.YearSalary();
            E1.display();
     }
}
             