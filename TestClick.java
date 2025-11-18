abstract class ButtonClick
{
      abstract void OnClickListner();
}
class TestClick
{
       public static void main(String args[])
       {
             ButtonClick c1=new ButtonClick()
             {
                   void OnClickListner()
                   {
                       System.out.println("Button Clicked By User");
                   }
             };

             c1.OnClickListner();
       }
}
             