
class InvalidUsernameException extends Exception
{
      InvalidUsernameException(String str)
      {
           super(str);
      }
}

class UserNameValid 
{
 
      void display(String userName) throws InvalidUsernameException
      {
           if(userName.length() <6  || userName.contains(" "))
           { 
                throw new InvalidUsernameException("username must be at least 6 characters & must not contain spaces");    
           }
      
           else
           {
                  System.out.println("Valid UserName");
           }
      }

      public static void main(String args[])
      {
              UserNameValid s1=new UserNameValid();

              try
              {
                       s1.display("Nai1 23");
              }

              catch(Exception e)
              {
                        System.out.println(e);
              }
      }
}
              