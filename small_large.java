class small_large{
 
      public static void main(String args[])
      {
              int num=547398;
              int digit=0;
              int largedigit=0;
              int smalldigit=9;
              while(num>0)
              {
                     digit=num%10;
                     if(largedigit<digit)
                     {
                           largedigit=digit;
                     }
                     if(digit<smalldigit)
                     {
                          smalldigit=digit;
                     }
                     num=num/10;
             }
             System.out.println("Large Digit in number:" + largedigit);
             System.out.println("Small Digit in number:" + smalldigit);
     }
}