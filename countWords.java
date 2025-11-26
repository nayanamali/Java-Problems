import java.util.*;
class countWords
{
     public static void main(String args[])
     {
 
     StringTokenizer str=new StringTokenizer("Java is Best Language");

     int count=0;

     while(str.hasMoreTokens())
     {
            str.nextToken();
            count++;
     }

     System.out.println("Total words in sentence:" + count);
     }
}
     