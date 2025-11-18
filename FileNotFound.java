//Compile Time Exception
import java.io.FileReader;
class FileNotFound
{
          public static void main(String args[])
          { 
             try
             {
                  FileReader f1=new FileReader("missing.txt");  //unreported exception FileNotFoundException; must be caught or declared to be thrown
             }

             catch(Exception e)
             {
                 System.out.println(e);       //java.io.FileNotFoundException: missing.txt (The system cannot find the file specified)
             }
          }
}