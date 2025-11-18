class digit{
 
      public static void main(String args[])
      {
             int num=12345;
             int digit=0;
             System.out.println("Enter Number:" + num);
             System.out.println("Reverse of Given number:");
             while(num>0)
             {
                    digit=num%10;
                    System.out.println(digit);
                    num=num/10;
             }
      }
}