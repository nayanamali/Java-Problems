//throw :- It is used to forceFully Raise Exception in Java Program

class ThrowDemo
{
      public static void Validate(int age)    
      {
              if(age<18)
              {
                  throw new ArithmeticException("The Person is not in valid age");
              }

              else
              {
                     System.out.println("Valid Age");
              }

      }

      public static void main(String args[])
      {
             try
             {
             Validate(14);
             }
             catch(Exception e)
             {
                   System.out.println(e);
             }
             System.out.println("Rest of code");
      }
}
