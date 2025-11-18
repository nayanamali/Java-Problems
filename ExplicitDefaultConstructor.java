class ExplicitDefaultConstructor
{
 
                        int a;
                        int b;
                
                        ExplicitDefaultConstructor()     //Explicit Default Constructor
                        {
                               a=10;                     //Here compiler could not automatically assign default Values
                               b=20;                     //here user can provide values they want to give
              
                        }
                  
                        void display()
                        {
                                  System.out.println("Value of a:" +a);
                                  System.out.println("Vlaue of b:" +b);
                        }
 
                        public static void main(String args[])
                        {
                                     ExplicitDefaultConstructor e1=new ExplicitDefaultConstructor(); 
                                     e1.display();
                        }
}
                        