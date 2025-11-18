class polindrome1{
 
      public static void main(String args[])
      {
            int num=151;
            int orno=num;
            int rev=0,rem=0;
            while(num>0)
            {
                    rem=num%10;
                    rev=rem+rev*10;
                    num=num/10;
            }
            System.out.println("Original Number:" +orno);
            System.out.println("Reverse Number:"+ rev);
            if(rev==orno)
            {
                  System.out.println("Given number is polindrome");
            }
            else
            {
                  System.out.println("Given number is not polindrome");
            }
      }
}