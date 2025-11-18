//Multiple Inheritance in Java
class Employee
{
          int salary=40000;
          String company_name="FCTP";
}
class Programmer extends Employee
{
          int bonus=10000;
          String name="Shyam";
          String skill="Java";
}
class Jprogrammer extends Programmer
{
          int bonus=5000;
          String name="Gokul";
}
class MultilevelInheritance
{
           public static void main(String args[])
           {
                Jprogrammer p1=new Jprogrammer();
                System.out.println("Name:" +p1.name+" Salary:" +p1.salary+ " Bonus:" +p1.bonus+ " Company_name:" +p1.company_name +" Skill:" + p1.skill);;
           }
}