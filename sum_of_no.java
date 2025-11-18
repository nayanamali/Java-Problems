class sum_of_no{
    
       public static void main(String args[])
       {
              int num=100;
              int even_sum=0;
              int odd_sum=0;
              for(int i=1;i<=num;i++)
              {
                   if(i%2==0)
                   {
                             even_sum+=i;
                   }
                   if(i%2!=0)
                   {
                             odd_sum+=i;
                   }
              }
              System.out.println("Sum of all Even numbers between 1 to 100:" + even_sum);
              System.out.println("Sum of all Even numbers between 1 to 100:" + odd_sum);
       }
}
              