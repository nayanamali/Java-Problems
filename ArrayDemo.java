//Three ways to declare array in java

//two ways to instantiate array :- datatype arrayname = new datatype[size of array] , datatype arrayname[]= {values};

class ArrayDemo
{
     public static void main(String args[])
     {
        int a[]=new int[5];
        a[0]=10;a[1]=20;a[2]=30;a[3]=40;a[4]=50;

        for(int i=0;i<5;i++)
        {
             System.out.println(a[i]);
        }

        int d[]={10,20,30,40,50};
 
        int[] b;
   
        int []c;
     }
}