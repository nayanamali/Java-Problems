class duplicateCharacters
{
    public static void main(String args[])
    {
         String str=" Java is powerful ";

         String largest = " ";

         String smallest = " ";

         String str1=str.substring(1,5);

         String str2=str.substring(6,8);
 
         String str3=str.substring(9,17);

         System.out.println(str1 + " " + str2 + " " + str3);

         if(str1.length() > str2.length() && str1.length() > str3.length())
         {
                 largest=largest.concat(str1);
         }

         if(str2.length() > str3.length() && str2.length() > str1.length())
         {
                 largest=largest.concat(str2);
         }

         if(str3.length() > str1.length() && str3.length() > str2.length())   
         {
                 largest=largest.concat(str3);
         }

         if(str1.length() > str2.length() && str3.length() > str2.length())
        {
                 smallest=smallest.concat(str2);
        }
  
        if(str2.length() > str1.length() && str3.length() > str1.length())
        {
                 smallest=smallest.concat(str1);
        }

        if(str1.length() > str3.length() && str2.length() > str3.length())
       {
                 smallest=smallest.concat(str3);
       }

        System.out.println("Largest Word : " + largest);

        System.out.println("Smallest Word : " + smallest);
    }
}

      