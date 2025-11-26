class multiException
{
     public static void main(String args[])
     {
             try
             {
                   int a=10/0;
                   int a1[]={10,20,30,40,50};
                   String str2="Welcome";
                   String str3="Hello";
                   int no=Integer.parseInt(str3);

             }

             catch(ArithmeticException e)
             {
                    System.out.println(e);
             }


             catch(ArrayIndexOutOfBoundsException e)
             {
                   System.out.println(e);
             }

             catch(StringIndexOutOfBoundsException e)
             {
                   System.out.println(e);
             }

             catch(NumberFormatException e)
             {
                   System.out.println(e);
             }
       }
}