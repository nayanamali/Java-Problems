class ThisMethod
{
 
                 public ThisMethod()
                 {
                          this(10);
                          System.out.println("Default constructor");
                          //this(10);
                 }
                 public ThisMethod(int a)  
                 {
                         
                         System.out.println("Pararmeterized Constructor: " +a);
                 }
}
class Testdemo1
{
           
           public static void main(String args[])
           {
                    this_method t1=new this_method();
            }
}