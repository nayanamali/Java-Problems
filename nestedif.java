class nestedif{
           
            public static void main(String args[])
            {
                   int num=10;
                   if(num>0)
                   {
                        if(num%2==0)
                        {
                              System.out.println("Given number is even");
                        }
                        else
                        {
                              System.out.println("Given number is odd");
                        }
                       System.out.println("Given number is positive");
                   }
                   else
                   {
                        System.out.println("Given number is negative");
                   }
               }
}

