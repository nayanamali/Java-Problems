abstract class shape
{
     abstract void calculateArea();
}
class Circle extends shape
{
     double area;
     double radius;
     Circle(double radius)
     {
            this.radius=radius;
     }

     void calculateArea()
     {
          area=3.14*radius;
     }

     void displayArea()
     {
          System.out.println("Radius of Circle : " + radius);
          System.out.println("Area of Circle : " + area);
     }
}

class Rectangle extends shape
{
     int area;
     int length;
     int breadth;

     Rectangle(int length,int breadth)
     {
          this.length=length;
          this.breadth=breadth;
     }

     void calculateArea()
     {
           area=length*breadth;
     }

     void displayArea()
     {
           System.out.println("Length of Rectangle : " + length);
           System.out.println("Breadth of Rectangle : " + breadth);
           System.out.println("Area of Rectangle : " + area);
     }
}

class TestShape
{
    public static void main(String args[])
    {
           Circle c1=new Circle(5.0);
           c1.calculateArea();
           c1.displayArea();
  
           Rectangle r1=new Rectangle(10,20);
           r1.calculateArea();
           r1.displayArea();
    }
}

     