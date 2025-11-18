class thisChain
{
       thisChain()
       {
             System.out.println("Default Constructor");
       }

       thisChain(int x)
       {
             this();
             System.out.println("Parameterized COnstructor " + x);
       }
}
class TestThisChain
{
      public static void main(String args[])
      {
              thisChain t1=new thisChain();
      }
}