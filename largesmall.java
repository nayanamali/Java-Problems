class largesmall
{
     public static void main(String args[])
     {
        int a[]=new int[5];
   
        for(int i=0;i<args.length;i++)
        {
              a[i]= Integer.parseInt(args[i]);
        }

        
        
        for(int j:a)
        {
              System.out.println(j);
        }
        
        int smallElement=a[0]; 
        int largeElement=a[0];
        for(int i=0;i<a.length;i++)
        {
                  if(a[i]>largeElement)
                  {
                      largeElement=a[i];
                  }

        }
        System.out.println("large Element:" + largeElement);
        for(int i=0;i<a.length;i++)
        {
                  if(a[i]<smallElement)
                  {
                      smallElement=a[i];
                  }

        }
        System.out.println("Small Element:" + smallElement);
   }
}