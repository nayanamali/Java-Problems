interface add
{
         default void displayadd()
         {
            int a=10;
            int b=20;
            int addition=a+b;
            System.out.println("Addition:" + addition);
         }
}
interface sub 
{
         int a=10;
         int b=20;
         default void displaysub()
         {
            int subtract=a-b;
            System.out.println("Subtraction:" + subtract);
         }
}
class mult implements add,sub
{
         void displaymult()
         {
            int multiply=a*b;
            System.out.println("Multiplication:" + multiply);
         }
}
class div extends mult
{
         void displaydiv()
         {
            int divide=a/b;
            System.out.println("Divison:" + divide);
         }
}
class hybridedemo
{
        public static void main(String args[])
        {
             div d1=new div();
             d1.displayadd();
             d1.displaysub();
             d1.displaymult();
             d1.displaydiv();
        }
}