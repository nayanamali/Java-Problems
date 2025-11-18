class ConMethod{
   
               void display(int b)          
               {
                          System.out.println("Hello From display :" + b);
               }
               void show(int a)
               {
                          System.out.println("Hello from show :" + a);
                          this.display(a); //with this keyword           //this.display() = 
display() 
                          //this keyword is used to access current instance of the class that is varaibles and methods
               }
}
class Test
{
             public static void main(String args[])
             {
                      ConMethod m1=new ConMethod();
                      m1.show(10);
                      ConMethod m2=new ConMethod();
                      m2.show(20);
             }
}