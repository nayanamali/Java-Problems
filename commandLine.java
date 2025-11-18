/*class commandLine
{
     public static void main(String args[])
     {
          System.out.println("My Command line data");
          for(String j:args)
          {
               System.out.println(j);       //java commandLine Hello World Good Morning  
         }
     }
}*/

class intergerData
{
      public static void main(String args[])
      {
         int a[]=new int[5];
   
         for(int i=0;i<args.length;i++)
         {
            a[i]=Integer.parseInt(args[i]);
         }

         for(int j:a)
         {
           System.out.println(j);
         }
      }
}