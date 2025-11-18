class ArrayBounds extends Exception
{
     public customException(String str)
     {
            System.out.println(str);
     }
}
class custom2 
{
     public void display()
     {
         int a[]={10,20,30,40,50};
   
         System.out.println(a[10]);

         throw new ArrayBounds();
     }

     public static void main(String args[])
     {
           custom2 c2=new custom2();
      
           try
           {
                 c2.display();
           }

           catch(ArrayBounds e)
           {
                 System.out.println(e);
           }
    }
}       