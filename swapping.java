class swapping{
      public static void main(String args[])
      {
         int temp;
         int a=10;
         int b=20;
         System.out.println("Before Swapping");
         System.out.println("Value of a:" + a);
         System.out.println("Value of b:" +b);
         temp=a;
         a=b;
         b=temp;
         System.out.println("After Swapping");
         System.out.println("Value of a:" + a);
         System.out.println("Value of b:" +b);
     }
}