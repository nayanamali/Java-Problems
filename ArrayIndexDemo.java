class ArrayIndexDemo
{
       public static void main(String args[])
      {

            int[] a={10,20,30,40,50};

            System.out.println("Exception Handling");

            try
            {
                   int i=10;
                   System.out.println(a[i]);      //Exception Handlinjava.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
            }

            catch(Exception e)
            {
                 System.out.println(e);
            }

             System.out.println("Rest of code");

      }
}