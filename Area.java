//write a java program to calculate area of circle ,Square and Rectangle

class Area
{
          
        double area;
        
        void circle(double radius)
        {
            area=3.14*radius*radius;
            System.out.println("Area of Circle:" +area);
        }

        void square(double side)
        {
            area=side*side;
            System.out.println("Area of Square:" +area);
        }
    
        void rectangle(double length,double breadth)
        {
             area=length*breadth;
             System.out.println("Area of Square:" +area);
        }
        public static void main(String args[])
        {
              Area a1=new Area();
              a1.circle(2);
              a1.square(12);
              a1.rectangle(10,20);
        }
}
 