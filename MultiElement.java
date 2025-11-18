class MultiElement
{
    public static void main(String args[])
    {
         //int a[]={10,20,30,40,50};
       
         int a[] = new int[5];      //another way of declaring array 

   
         a[0]=10;
         a[1]=20;
         a[2]=30;
         a[3]=40;
         a[4]=50;
  
         System.out.println(a[0]);
         System.out.println(a[1]);
         System.out.println(a[2]);
         System.out.println(a[3]);
         System.out.println(a[4]);

         System.out.println("Using for loop");
   
         for(int i=0;i<a.length;i++)    //length is property of an array
         {
              System.out.println(a[i]);
         }

          System.out.println("Using foreach loop");

          for(int j:a)
          {
              System.out.println(j);
          
          }
    }
}
         
