class StringShow
{
      public static void main(String args[])
      {
            String str="Hello World";
        
            String str1="Good Morning";
 
            System.out.println("Before Assigning....");
 
            System.out.println("Str:" + str);

            System.out.println("Str1:" + str1);
            
            System.out.println("Concatenation:" + str.concat(str1));

            String str3=str;
 
            str="Hello Ram";

            System.out.println("After Assigning....");
 
            System.out.println("Str:" + str);

            System.out.println("Str1:" + str1);

            System.out.println("Str3:" + str3);
       }
}