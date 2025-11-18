import java.util.*;
class StringTokenTest
{
         public static void main(String args[])
         {
                 String s1="Have a nice day";          //Default seperator ( space)
                 
                 StringTokenizer st= new StringTokenizer(s1);

                 while(st.hasMoreTokens())                         //checks whether String contains tokens or not
                 {
                       System.out.println(st.nextToken());        //move to nexttoken
                 }

                 String s2="Have,a,nice,day";
                 
                 StringTokenizer st1= new StringTokenizer(s2);

                 while(st1.hasMoreTokens())                         //checks whether String contains tokens or not
                 {
                       System.out.println(st1.nextToken(","));       //specify seperator
                 }
         }
}
    