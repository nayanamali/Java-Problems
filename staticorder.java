class staticorder
{
             static 
             {
                System.out.println("First Static Block....");
     	     }
  	     
	     static 
             {
                System.out.println("Second Static Block....");
     	     }
 	     
	     public static void main(String args[])
 	     {
                   staticorder o1=new staticorder();
             }
}