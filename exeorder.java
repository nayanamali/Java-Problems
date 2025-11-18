class exeorder
{
       static
       {
           System.out.println("This is Static Block");
       }

       exeorder()
       {
         System.out.println("This is Constructor Block");
       }
    
       public static void main(String args[])
       {
              exeorder e1=new exeorder();
              System.out.println("This is main method block");
       }
}