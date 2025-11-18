class StringPractice
{
     public static void main(String args[])
     {
           String s="  Hello World  ";

           int length=s.length();
  
           System.out.println("Length of String : " + length);
    
           String s1="Hello World";

           System.out.println("Both S And s1 are equal: " + s.equals(s1));

           String upper= s1.toUpperCase();

           System.out.println("To UpperCase: " + upper);

           String lower= s1.toLowerCase();

           System.out.println("To LowerCase : " + lower);

           System.out.println(" Check Whether String Conatins or not : " +  s1.contains("World"));

           String replace = s1.replace('o','a');

           System.out.println("After Replaced String : " + replace);

           System.out.println("Before Remove Spaces from Begin and end : " + s);

           System.out.println("Remove Spaces from Begin and end : " + s.trim());

           String str=String.join(",","This","is","the","java");
           
           System.out.println(str);
   
     
     }
}