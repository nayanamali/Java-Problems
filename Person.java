class Person
{
      String name;
      int age;
      String city;
     
      Person setName(String name)
      {
                this.name=name;
                return this;
      }
 
      Person setAge(int age)
      {
               this.age=age;
               return this;
      }
  
      Person setCity(String city)
      {
               this.city=city;
               return this;
      }

      void displayinfo()
      {
               System.out.println("Name:" +name);
               System.out.println("Age:" +age);
               System.out.println("City:" +city);
       }

      public static void main(String args[])
      {
             Person p=new Person();
             p.setName("Nayana").setAge(20).setCity("Pune");
             p.displayinfo();
       }
}