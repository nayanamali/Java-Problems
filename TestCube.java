class calculate
{
               static int cube(int x)
               {
                          return  x*x*x;
               }
}
class TestCube
{
             public static void main(String args[])
             {
                     int res=calculate.cube(5); //non-static method cube(int) cannot be referenced from a static context
                     
                     System.out.println("Cube of number:" + res);
             }
}