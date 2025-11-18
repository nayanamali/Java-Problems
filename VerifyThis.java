class VerifyThis
{
          
               void info()
               {
                        System.out.println(this);     //generate reference number
               }

               public static void main(String args[])
               {
                        VerifyThis t1=new VerifyThis();      //generate reference number
                        System.out.println(t1);
 
                        t1.info();                            //generate reference number
               }
}