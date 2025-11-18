class arrange
{
    public static void main(String args[])
    {
          int a[]={30,10,20,25,15};
    
          for(int i=0;i<5;i++)
          {
               System.out.println(a[i]);
          }

          int temp=0;

          for(int i=0;i<5;i++)
         {
              for(int j=i+1;j<5;j++)
              {
                     if(a[i]>a[j])
                    {
                     temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                    }
              }
         }
         System.out.println("Increment Array");

         for(int i=0;i<5;i++)
         {
              System.out.println(a[i]);
         }

          for(int i=0;i<5;i++)
         {
              for(int j=i+1;j<5;j++)
              {
                     if(a[i]<a[j])
                    {
                     temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                    }
              }
         }
           System.out.println("Decrement Array");

         for(int i=0;i<5;i++)
         {
              System.out.println(a[i]);
         }

    }
}