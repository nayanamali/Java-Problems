import java.io.FileReader;
class IOEXCEPTION
{
        public static void main(String args[])
        {
           try
           {
            FileReader fr=new FileReader("missing.txt");
    
            int data= fr.read();
 
            System.out.println((char) data);
           }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
}
                   
   
            