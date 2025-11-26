class reverseString 
{
      public static void main(String args[])
      {
              String str="java";
              System.out.println("Original String: " +str);
              System.out.print("Reverse String : ");
              for(int i=str.length()-1;i>=0;i--)
              {
                     char ch=str.charAt(i);
                    
                     System.out.print(ch);
              }

                     
      }
}