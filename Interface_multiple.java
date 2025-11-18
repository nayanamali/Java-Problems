//multiple inheritance in java is achived through interface
interface A
{
       int id=101;
   
}
interface B 
{
        String name="Ram";
        
}
interface E implements A,B
{
        String city="Pune";

        void child()
        {
             System.out.println("ID:" +id + " Name:" + name + " City: " + city);
        }

        public static void main(String args[])
        {
               System.out.println("Child Class...");

               E c1=new E();
               c1.grandparent();
               c1.parent();
               c1.child();
        }
}
  