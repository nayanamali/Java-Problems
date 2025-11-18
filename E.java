//multiple inheritance in java is achived through interface
interface A
{
       int id=101;
   
}
interface B 
{
        String name="Ram";
        
}
interface D
{
        String color="White";
}
class E implements A,B,D
{
        String city="Pune";

        void child()
        {
             System.out.println("ID:" +id + " Name:" + name + " City: " + city + " Color:" +color);
        }

        public static void main(String args[])
        {
               System.out.println("Multiple Inheritance through Interface...");

               E e1=new E();
               e1.child();
        }
}
  