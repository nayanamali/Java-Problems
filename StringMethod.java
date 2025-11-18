class StringMethod
{
      public static void main(String args[])
      {
             String s1;
   
             //join() :- It will join group of Strings by using Specified Seperators
             s1=String.join(" , "," This "," Year " ," we  "," received " ," huge ", " rain ");
   
             System.out.println("Join Method: " + s1);

             s1=String.join(":" , "12" ,"00" ,"00");

             System.out.println("Join Method: " + s1);
 
             s1=String.join("-" , "Have" ,"a" ,"nice","day");

             System.out.println("Join Method: " + s1);

             //contains(String/Text) :- It will checks whether String/Text Present into Given String  ( If Yes - > True ) ( IF Not - > False)

             String s2="Awsome";
  
             System.out.println("Contains String : "  + s2.contains("some"));   //return true

             System.out.println("Not Contains String : "  + s2.contains("done"));  //return false

            //trim():- Simply It Removes Extra prefix and postfix Spaces

            String s3="     coding is     ";

            System.out.println("without trim() : " + s3 + "awsome" );

            System.out.println("Using trim() : "   + s3.trim() + " awsome" );

           //replace(oldChar,newChar) : - replaces old character to new character

            String s5=" Have a nice day";

            System.out.println("Replaces a with i : " + s5.replace('a','i'));



      }
}