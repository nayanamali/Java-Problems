class ConstructorOverload
{
      String name;
      int age;
      double grade;

     ConstructorOverload()
      {
               System.out.println("Default Constructor");
      }

     ConstructorOverload(String name , int age , double grade)
      {
             this.name=name;
             this.age=age;
             this.grade=grade;
      }

      void display()
      {
              System.out.println("Name : " + name + " Age : " + age + " Grade : " + grade);
      }

      public static void main(String args[])
      {
             ConstructorOverload c1 = new ConstructorOverload();
             ConstructorOverload c2 = new ConstructorOverload("Ram",18,95.60);
             c2.display();
      }
}