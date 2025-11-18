class load
{
         
         load getA()
         {
                return this;
         }
         void message()
         {
               System.out.println("Method Demo");
         }

       public static void main(String args[])
       {
              new load().getA().message();
       }
}