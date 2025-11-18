class searchElement
{
     public static void main(String args[])
     {
            System.out.println("To Search Whether an Element is present into arrray or not");    

            int a[]={1,2,3,4,5};

            System.out.println("Elements of Array");

            for(int i=0;i<5;i++)
            {
                 System.out.println(a[i]);
            }
 
            int searchValue=10;
            int notFound=0;
            int Found=0;
            System.out.println("Search Element:" + searchValue);

            for(int i=0;i<5;i++)
            {
                notFound=0;
                if(a[i]==searchValue)
                {
                     Found=1;  
                } 
                else
                {
                     notFound=1;
                }  
            }
            if(Found==1)
            {
                    System.out.println("Present in array");
            }
            else
            {
                    if(notFound==1)
                    {
                    System.out.println("Not Present in array");
                    }
            }
            
            
      }
}