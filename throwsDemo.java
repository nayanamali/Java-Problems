//When we want to raise compile time exception than we need to first Declare that exception using throws Keyword and throw it using throw Keyword
//In Case of Unchecked Exception : We need only throw Keyword
//In Case of Checked Exception  : we need both throw and throws keyword

import java.io.*;
class throwsDemo
{
      public static void FileFound() throws FileNotFoundException
      {

      FileReader fr = new FileReader("C:\\user\\desktop\\abc.txt");
    
      throw new FileNotFoundException("");
     
      }

      public static void main(String args[])
      {
             try
             {
                    FileFound();
             }

             catch(Exception e)
             {
                   System.out.println(e);
             }

             System.out.println("Rest of Code .....");
      }
}
