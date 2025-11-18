class sumNatural
{
     public static void main(String args[])
     {
        int a[]=new int[10];
  
        for(int i=0;i<args.length;i++)
        {
               a[i]=Integer.parseInt(args[i]);  //to take inupt from user through command line
        }

        int sum=0;
   
        for( int j:a)        //to print data
        {
              sum+=j;
        }
        
       System.out.println("Sum of first 10 Natural Number:" +sum);  
    }
}