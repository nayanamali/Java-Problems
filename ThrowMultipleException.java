class ThrowMultipleException
{
     void display(int option)
     {
            if(option==1)
            {
                int div=10/0;
            }

            else if(option==2)
            {
                 int[] a={10,20,30,40,50};
                 System.out.println(a[5]);
            }

            else if(option==3)
            {
                String str=null;
                System.out.println(str.length());
            }

            else if(option==4)
            {
                String str1="Hello";
                int no=Integer.parseInt(str1);
                System.out.println(no);
            }

            else if(option==5)
            {
                String str2="Java";
                System.out.println(str2.charAt(5));
            }
      }

      public static void main(String args[])
      {
               
              ThrowMultipleException t1=new ThrowMultipleException();
              System.out.println("Choose Which Type Of Exception You Want To perform");
              System.out.println("1.ArithmaticException");
              System.out.println("2.ArrayIndexOutOfBoundsException");
              System.out.println("3.NullPointerException");
              System.out.println("4.NumberFormatException");
              System.out.println("5.StringOutOfBoundsException");
              System.out.println();
              for(int i=0;i<=5;i++)
             { 
               
               try
               {
                    t1.display(i);
               }

               catch(Exception e)
               {
                   System.out.println(e);
               }
        
               System.out.println();
             }
       }
}  
              

