class armstrong{
        
     public static void main(String args[])
     {
              int num=153;
              int orno=num;
              System.out.println("Original Number:" + orno);
              int sum=0;
              int rem=0;
              while(num>0)
              {
                    rem=num%10;
                    sum+=rem*rem*rem;
                    num=num/10;
              }
              System.out.println("Sum of Cube of each digit:" +sum);
              if(sum==orno)
              {
                System.out.println("Given number is armstrong");
              }
              else
              {
                System.out.println("Given number is not armstrong");
              }
       }
}
             
 