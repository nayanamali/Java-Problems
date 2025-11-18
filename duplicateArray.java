class duplicateArray
{
     public static void main(String args[])
     {
     int a[]={1,2,3,4,5,6,7,8,9,10};
     int even[]=new int[10];
     int odd[]=new int[10];
     int edx=0;
     int odx=0;
     for(int i=0;i<a.length;i++)
     {
          
               if(a[i]%2==0)
               {
                   even[edx]=a[i];
                   edx++;
               }

     }
     System.out.println("Even Array");
     for(int i=0; i<edx;i++)
     {
             System.out.println(even[i]);
     }

     for(int i=0;i<a.length;i++)
     {
           if(a[i]%2!=0)
           {
                odd[odx]=a[i];
                odx++;
           }
     
     }
     System.out.println("Even Array");
     for(int i=0; i<odx;i++)
     {
             System.out.println(odd[i]);
     }
 
}

}