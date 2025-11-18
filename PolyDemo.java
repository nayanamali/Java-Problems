//Polymorphism :- Using Same name method to perform Multiple Task
class PolyDemo
{
     void display()
     {
         System.out.println("Display Method Get Exexcuted");
     }
     
     void display(int a)
     {
        System.out.println("Display Method Get Exexcuted "+ a);
     }
 
     void display(String n)
     {
        System.out.println("Display Method Get Exexcuted "+ n);
     }

     public static void main(String args[])
     {
           PolyDemo p1=new PolyDemo();
           p1.display();
           p1.display(10);
           p1.display("Ram");
     }
}