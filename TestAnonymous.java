//Anonymous-Clas :- A class that does not have name and placed inside another class Known as Anonymous Class
//Anonymous class Can have only Single Object
//Basic use of this If we want to override method of abstract class or interface without inheriting or implementing to them than we cam used anonymous class to override method of them


abstract class A
{
     abstract void run();
}

class TestAnonymous
{
     public static void main(String args[])
     {
                A t1=new A()
                {
                     void run()
                     {
                               System.out.println("Abstract class Method");
                     }
                };

                t1.run()
     }
}

    