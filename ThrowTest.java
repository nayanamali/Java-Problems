import java.io.*;

class ThrowsDemo
{
        void display() throws IOException
        {
              System.out.println("Throws Example");
        }
}

class ThrowTest
{
        public static void main(String args[])
        {
              ThrowsDemo t1=new ThrowsDemo();

              try
              {
                  t1.display();
              }

              catch(Exception e)
              {
                 System.out.println(e);
              }
       }
}

//When we use Throws Keyword to declare Exception than it must be handle or caught by using try & Catch Block

//Diffrence Between Throw ( used to raise exception) and Throws Keyword

//Diffrence between final (Keyword) ,finally (Block) and finalize (method)?

//What is Exception?
//Types of Exception?
//How to Achieve Exception handling in Java?
//Finally Block
//Throw,Throws,Custom Exception