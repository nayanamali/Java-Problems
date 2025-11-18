class primedemo{
 
      public static void main(String args[])
      {
             int num=113;
             int count=0;
             System.out.println("Given number is:" +num);
             for(int i=1;i<=num;i++)
             {
                  if(num%i==0)
                  {
                        count++;
                        break;
                  }
             }
             System.out.println("Number Divisible upto " + count +"times");
             if(count==2)
             {
                     System.out.println("Given number is prime");
             }
             else
             {
                     System.out.println("Given number is not prime");
             }
       }
}
     