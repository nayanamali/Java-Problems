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