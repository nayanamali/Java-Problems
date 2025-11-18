class copyDemo
{
     public static void main(String args[])
     {
           int a[]={10,20,30,40,50};
           int b[]=new int[5];

           for(int i=0;i<5;i++)
           {
                   b[i]=a[i];
           }

           System.out.println("New Array Created:" );

           for(int i=0;i<5;i++)
           {
                 System.out.println(b[i]);
           }
     }
}