class sumdigits{
    
     public static void main(String args[])
     {
                int num=12345;
                int digit=0;
                int sum=0;
                while(num>0)
                {
                        digit=num%10;
                        sum+=digit;
                        num=num/10;
                }
                System.out.println("Sum of each digit Present into Number:" +sum);
     }
}
 
                