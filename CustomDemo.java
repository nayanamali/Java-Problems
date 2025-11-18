//Create a Invalid Age Exception for Validating Voting age of user ?

//Rasie that Exception and handle and printDetails

class InValidException extends Exception
{
        public InValidException(String str)
        {
                super(str);
        }

}

public class CustomDemo
{
        public static void Demo(int age) throws InValidException
        {
             if(age<18)
             {
                  throw new InValidException("Invalid Age");
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
                    Demo(14);
              }

              catch(Exception e)
              {
                    System.out.println(e);
              }
         }
}


//Throws : - Deslaring an exception in java Which inform to programmer that he has used Exception handling mechaninsm in his program
//Throw : - used to throw an exception