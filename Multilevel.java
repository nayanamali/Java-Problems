class Manager
{
      String name;
      double salary;
      int total;
      void man(String name,double salary,double bonus)
      {
           this.name=name;
           this.salary=salary;
           total=salary+bonus;
           System.out.println("Name :" + name + " Salary:" + salary + "Total Bonus + Salary:" + total);
      } 
}
class Developer extends Manager
{
      void dev(String name,double salary,double bonus)
      {
           this.name=name;
           this.salary=salary;
           total=salary+bonus;
           System.out.println("Name :" + name + " Salary:" + salary + "Total Bonus + Salary:" + total);
      } 
}
class Intern extends Developer
{
       void Int(String name,double salary,double bonus)
      {
           this.name=name;
           this.salary=salary;
           total=salary+bonus;
           System.out.println("Name :" + name + " Salary:" + salary + "Total Bonus + Salary:" + total);
      } 
}

class multilevel
{
       public static void main(String args[])
       {
            Intern i1=new Intern();
            i1.man("Ram",30500.00,30000.00);
            i1.dev("Shyam",25000.00,20000.00);
            i1.Int("Shweta",20500.00,10000.00);
        }
}