class EmployeeJava
{
       int id;
       String name;
       String city;
       int salary;
       int bonus;
       int totalSalary;
       EmployeeJava(int id,String name,String city,int salary,int bonus)
       {
              this.id=id;
              this.name=name;
              this.city=city;
              this.salary=salary;
              this.bonus=bonus;
       }


       void calculateSalary()
       {
                 class localClass
                 {
                         void display()
                         {
                               System.out.println("Id : " + id + " Name : " + name + " City : " + city + " Salary : " + salary + " Bonus : " + bonus );
                         }
                         void show()
                         {
                               totalSalary=salary+bonus;
                               System.out.println("Total Salary : " + totalSalary);
                         }
                 }
   
              localClass l1=new localClass();
              l1.display();
              l1.show();
       }
   
       public static void main(String args[])
       {
              EmployeeJava e1=new EmployeeJava(101,"Ram","Pune",25000,10000);
              e1.calculateSalary();
       }
}
                 