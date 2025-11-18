class StringFunction
{
     public static void main(String args[])
     {
           String s1="Hello";
           String s2="World";
           String s4="Hello";
           String s5= new String("World");

           //concat():- two merge two Strings

           System.out.println("Concatenation of s1 and s2 : " + s1.concat(s2));  //Standard Method

           String s3=s1+s2;

           System.out.println("Using + Operator:"  + s3);     // using + operator

           //length() function

           System.out.println("Length of S3 : " + s3.length());

           //charAt(num/int) :- It will return Character at Specific Index  HelloWorld:-10   charAt(3):- l

           System.out.println("Charater at 3rd Index: " + s3.charAt(3));

           //substring(Start Index,End Index) : - return new String From Existing String

           System.out.println("SubString of S3 : " + s3.substring(5,10));

           System.out.println("Start index : " + s3.substring(7)); // Starting Index and return data till end of String

           //equals() :  Compare data within two Strings and Return true - if both Strings are equal , it returns false - if both Strings are not equal

           System.out.println("Both Strings are equal : " + s1.equals(s4));
   
           System.out.println("Both Strings are not equal : " + s1.equals(s2));
        
           System.out.println("Equal Data : " + s2.equals(s5));         //Compare String literal and String object

           System.out.println(" to UpperCase  : " + s4.toUpperCase());   //toUpperCase():- Convert String into uppercase

           System.out.println("toLowerCase  : " + s4.toLowerCase());   //tolowerCase():- Convert String into uppercase


     }
}