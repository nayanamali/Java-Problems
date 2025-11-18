class Exeception
{
      public static void main(String args[])
      {
              int a=10;
              int b=0;

              System.out.println("Exeception handling");
              System.out.println(a/b);                     // java.lang.ArithmeticException: / by zero
              System.out.println("Rest of Code");
      }
}

/*compile time Exception ( Checked Exception)
1.FileNotFound Exception
2.ClassNotFound Exeception
3.SQLException
4.I/O Exception
5.Interrupted Exeception
6.parseException
7.MalformedURLException
*/