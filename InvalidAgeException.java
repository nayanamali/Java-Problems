class InvalidAgeException extends Exception
{
        
        InvalidAgeException(String str)
        {
            super(str);
        }
       
        public void show(int age) throws InvalidAgeException
        {
            
               if(age<18)
               {
                      throw new InvalidAgeException("Invalid Age");
               }

               else
               {
                      System.out.println("Valid Age");
               }

        }


        public static void main(String args[])
        {
              InvalidAgeException e1= new InvalidAgeException("Default");
        
              try
              {
                  e1.show(14);
              }

              catch(InvalidAgeException e)
              {
                   System.out.println(e);
              }
         }
}