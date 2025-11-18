interface DrawableDemo 
{
      public void Draw();
}

class circle
{
      public static void main(String[] args)
      {
              DrawableDemo d1=new DrawableDemo()
              {
                     public void Draw()
                     {
                                System.out.println("Circle has been Drawn");
                     }
              };
                      
             d1.Draw();
       }
}