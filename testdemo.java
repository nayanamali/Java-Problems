class testdemo
{
           String name;
           int age;

           testdemo(String name,int age)
           {
               this.name=name;
               this.age=age;
           }
 
           void display()
           {
                 System.out.println("Name:" +name + " Age:" +age);
           }
        
           public static void main(String args[])
           {
                   testdemo t1=new testdemo("Ram",20);
                   t1.display();
           }
}