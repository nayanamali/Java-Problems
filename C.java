//multiple inheritance is not supported in java
class A
{
       int id=101;
       String name="Ram";
   
       void grandparent()
       {
              System.out.println("GrandParent Class...");
       }
}
class B 
{
        String city="Pune";
        
        void parent() 
        {
              System.out.println("Parent Class...");
        }
}
class C extends A,B
{
        

        void child()
        {
             System.out.println("ID:" +id + " Name:" + name + " City: " + city);
        }

        public static void main(String args[])
        {
               System.out.println("Child Class...");

               C c1=new C();
               c1.grandparent();
               c1.parent();
               c1.child();
        }
}
  