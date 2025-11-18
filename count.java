class count{
   
        public static void main(String args[])
        {
              int num=1234;
              System.out.println("Enter number:" +num);
              System.out.println("Each digit of number:");

              int digit=0;
              while(num!=0)
              {
                      digit=num%10;
                      num=num/10;
                      System.out.println(digit);
              }
         }
}
              