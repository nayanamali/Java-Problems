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
class Tester extends Employee
{
          int bonus=5000;
          String name="Gokul";
}
class HierachicalInheritance
{
           public static void main(String args[])
           {
                Programmer p1=new Programmer();
                System.out.println("Name:" +p1.name+" Salary:" +p1.salary+ " Bonus:" +p1.bonus+ " Company_name:" +p1.company_name +" Skill:" + p1.skill);

                Tester t1=new Tester();
                System.out.println("Name:" +t1.name+" Salary:" +t1.salary+ " Bonus:" +t1.bonus+ " Company_name:" +t1.company_name);

           }
}