class StringMethodEx
{
      public static void main(String args[])
      {
              String str=" Welcome ";

              System.out.println(str.concat("Hello"));

              System.out.println(str.length());

              System.out.println(str.replace('e','a'));
 
              System.out.println(str.substring(2,5));

              System.out.println(str.charAt(2));
 
              System.out.println(str.toLowerCase());
 
              System.out.println(str.toUpperCase());

              System.out.println(str.equals("Welcome"));

              String str1=String.join(",","This","is","a","java");

              System.out.println(str1);

              System.out.println(str.contains("come"));

              System.out.println(str.trim());

       }
}