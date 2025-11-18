//Strings are immutable.
class StringDemo
{
     public static void main(String args[])
     {
           String s1="Hello";   //First method to Create String in java
           String s2=new String("Welcome");  //Second method to Create String in java
           String s3="Hello";
           String s4=new String("Welcome");

           System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

           s3="HelloTest";
           s4="WelcomeTest";

           System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

           System.out.println(s1.concat(" Good Morning"));
        
           System.out.println(s1);
     }
}

//How to make String mutable :- StringBuilder and StringBuffer

//How to create Strings in java : Using Java literal and String Objects

//why java Strings are Knowns as immutable?