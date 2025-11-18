class AverageDemo
{
     public static void main(String args[])
     {
          int a[]={10,20,30,40,50};
    
          int sum=0;

          for(int i=0;i<5;i++)
          {
               sum+=a[i];
          }
    
          System.out.println("Sum of all Elements in array:" + sum);

          int avg=sum/5;
  
          System.out.println("Average of all elements in array:" + avg);
     }
}