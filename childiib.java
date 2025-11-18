class iib
{
       {
          System.out.println("IIB in Parent Class");
       }

       iib()
       {
          System.out .println("Parent Class Constructor");
       }
}
class childiib extends iib
{
       {
          System.out.println("IIB in Child Class");
       }
       childiib()
       {
          System.out.println("Child Constructor");
       }

       public static void main(String args[])
       {
             childiib c1=new childiib();
       }
}