//Create a class Rectangle with two constructors:One constructor takes only one argument (for square).
//Another constructor takes two arguments (for rectangle).Use this() to call one constructor from another.
class Rectangle
{
   
              int length;
              int breadth;
              int side;

              Rectangle(int side)
              {
                  this.side=side;
              }

              Rectangle(int length,int breadth) 
              {
                     this(10);
                     this.length=length;
                     this.breadth=breadth;
              }
         
              void displayArea()
              {
                      int square=length*length;
                      System.out.println("Area of  Square:" +square);
               
                      int rectangle=length*breadth;
                      System.out.println("Area of  Square:" +rectangle);   
              }
 
              public static void main(String args[])
              {
                         Rectangle r1=new Rectangle(10,20);
                         r1.displayArea();
              }
}