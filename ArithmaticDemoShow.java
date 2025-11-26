class ArithmaticDemoShow
{
     public static void main(String args[])
     {
          try
          {
             int a1=10/0;
             System.out.println("Number Divided: " + a1);

             try
             {
                      String str=null;
                      System.out.println("Length of String: " + str.length());
                    
                      try
                      {
                             int a[]={10,20,30,40,50};
                             System.out.println("Return Element present into this index: " + a[6]);
                            
                             try
                             {
                                   String str2="World";

                                   System.out.println("Character Present at this index : " + str2.charAt(6));
                                   
                                     try
                                     {
                                            String str3="Hello123";
                                            int no=Integer.parseInt(str3);
                                            System.out.println("Convert into String : " + no);
                                             
                                     }
                                   
                                     catch(NumberFormatException e)
                                    {
                                            System.out.println(e);
                                    }

                               }
        
                               
                               catch(StringIndexOutOfBoundsException e)
                               {
                                    System.out.println(e);
                               }

                          
                          }

                           catch(ArrayIndexOutOfBoundsException e)
                          {
                                    System.out.println(e);
                          }
   
                      }
                  
                      catch(Exception e)
                      {
                                    System.out.println(e);
                      }
 
                  }
                  
                  catch(ArithmeticException e)
                  {
                                    System.out.println(e);
                  }
                  
         }
}