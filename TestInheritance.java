//Inheritance in Java

//In Aggegation, we need to create object of each class to access data or properties of that class

//In Inheritance, 
//With the single object we can acess properties of another class

class Employee
{
          int salary=40000;
          String company_name="FCTP";
}
class Programmer extends Employee
{
          int bonus=10000;
          String name="Shyam";
}
class TestInheritance
{
           public static void main(String args[])
           {
                Programmer p1=new Programmer();
                System.out.println("Name:" +p1.name+" Salary:" +p1.salary+ " Bonus:" +p1.bonus+ " Company_name:" +p1.company_name);
           }
}