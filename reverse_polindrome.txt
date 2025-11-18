class reverse{
     public static void main(String args[])
     {
         int num=151;
         int orno=num;
         System.out.println("Original Number:" + orno);
         int rev=0;
         int rem=0; 
         while(num>0)
         {
               rem=num%10;
               rev=rev*10+rem;
               num=num/10;
         }
        System.out.println("Reverse Number:" +rev);
        if(rev==orno)
        {
          System.out.println("Given number is Polidrome");
        }
        else{
          System.out.println("Given number is not Polidrome");
        }
    }
}
               
