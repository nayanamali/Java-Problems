class verification
{
        int age;
      
        {
              age=20;
  
              if(age>=18)
              {
                   System.out.println("Adult Verified");
              }
     
              else
              {
                    System.out.println("Adult not Verified");
              }
        }

        verification()
        {
              System.out.println("Constructor Executed");
        }

        public static void main(String args[])
        {
               verification v1= new verification();
        }
}