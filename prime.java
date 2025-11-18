class prime{
     public static void main(String args[])
     {
        int num=131;
        System.out.println("Enter Number is " +num);
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        System.out.println("Count of numbers divisible:" + count);
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
     