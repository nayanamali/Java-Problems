//Static block can be always execute first 
//Static block is used to initialze to a Static Variables

class StaticBlockDemo
{
             
           int a;
           static int b;
  
           StaticBlockDemo(int a)
           {
                 this.a=a;
           }
         
           static{
                       b=20;
                       System.out.println("Static Block Executes.....");
                 }

           void show()
           {
                  System.out.println("a: " + a + " b: " + b);
           }

           public static void main(String args[])
             {
                    System.out.println("Main Method Executes....");
                    StaticBlockDemo d1=new StaticBlockDemo(10);
                    d1.show();
             }
}