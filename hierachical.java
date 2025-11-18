class Shape
{
         double area;
         void shapeArea()
         {
              System.out.println("Display Area of Circle, Rectangle, and Triangle.");
         }
}
class circle extends Shape
{
         int radius=10;
         
          void shapeArea()
         {
              area= 3.14*radius*radius;
              System.out.println("Display Area of Circle:" +area);
         }
}
class rectangle extends Shape
{
         int length=10;
         int breadth=20;
         
         void shapeArea()
         {
              area= length*breadth;
              System.out.println("Display Area of rectangle:" +area);
         }
}
class triangle extends Shape
{
          int base=10;
          int height=20;

           void shapeArea()
         {
              area=0.5*base*height;
              System.out.println("Display Area of triangle:" +area);
         }
}
class hierachical
{
         public static void main(String args[])
         {
                  circle c1=new circle();
                  c1.shapeArea();
                  rectangle r1=new rectangle();
                  r1.shapeArea();
                  triangle t1=new triangle();
                  t1.shapeArea();
         }
}

         
       