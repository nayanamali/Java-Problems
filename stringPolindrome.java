class stringPolindrome
{
      public static void main(String args[])
      {
            String str="Madam";
            String str2=" ";
            for(int i=str.length()-1;i>=0;i--)
            {
                  char ch = str.charAt(i);
                  str2= ch + str2;
            }

            System.out.println(str2);
 
            if(str.equals(str2))
            {
                  System.out.println("Given String is polindrome");
            }

            else
            {
                   System.out.println("Given String is polindrome");
            }
       }
}