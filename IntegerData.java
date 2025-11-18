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

class IntegerData
{
      public static void main(String args[])      //string args[] used to take input from Command line
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

class floatData
{
       public static void main(String args[])
       {
           float a[] =new float[5];
 
           for(int i=0;i<args.length;i++);
           {
                 a[i]=Float.parseFloat(args[i]);
           }

           for(float j:a)
           {
                 System.out.println(j);

           }
       }
}