//Create a class Employee where the constructor initializes name and salary, and a method displays the details.

class Employee
{
            String name;
            double salary;
 
            Employee()
            {
                     name="Ram"; 
                     salary=35000.00;
            }

            void display()
            {
                    System.out.println("Name: " +name +" , Salary: " + salary);
            }
  
            public static void main(String args[])
            {
                     Employee e1=new Employee();
                     e1.display();
            }
}