class Shape{
 
              String color;
              String bandwidth;
              double area;
 
              void draw()
              {
                         System.out.println("Draws a circle on screen");
              }
              void resize()
              {
                         System.out.println("Make it larger or smaller");
              }
              public static void main(String args[])
              {
                         Shape s1=new Shape();
                         s1.color="Red";
                         s1.bandwidth="2px";
                         s1.area=50.5;
                         System.out.println("Room color is " + s1.color + " with bandwidth " + s1.bandwidth + " and area is " + s1.area);
                         s1.draw();
                         s1.resize();
              }
}