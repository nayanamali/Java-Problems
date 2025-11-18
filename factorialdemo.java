class factorialdemo{
  
    public static void main(String args[])
    {
            int fact=1;
            int num=5;
            System.out.println("Enter number:" +num);
            for(int i=1;i<=num;i++)
            {
                   fact=fact*i;
            }
           System.out.println("Factorial of number:" +fact);
   }
}
 