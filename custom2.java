class ArrayBounds extends Exception
{
     public ArrayBounds(String str)
     {
            System.out.println(str);
     }
}
class custom2 
{
     public void display() throws ArrayBounds
     {
         int a[]={10,20,30,40,50};
   
         System.out.println(a[10]);

         throw new ArrayBounds("Array Bounds Out of Index");
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