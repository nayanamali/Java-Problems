final class ParentFinal
{
         final double pi=3.14;
        
}
class ChildFinal 
{
       ParentFinal obj;
       int r;
       ChildFinal(ParentFinal obj,int r)
       {
               this.obj=obj;
               this.r=r;
       }

       void display()
       {
           double area=obj.pi*r*r;
           System.out.println("Area of circle:" + area);
       }

}
class TestFinal
{
         public static void main(Stringa args[])
         {
             ParentFinal p1=new ParentFinal();
             ChildFinal c1=new ChildFinal(p1,5);
             c1.display();
          }
}