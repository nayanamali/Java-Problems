//which will execute first instance initializer block or constructor of class
//->here , instance initializer block will be execute first before constructor inside your class executed 
//Instance initializer block will be used to initialize the instance variable 
//Block does not have any name and once value assign to instance variable  than i remain same among all instance of classes.
//What are different types of Block available in Java?
class InstanceBlock
{
        int speed;
  
        public InstanceBlock()
        {
                    System.out.println("Value of Speed is " + speed);
                    System.out.println("Constructor Executed....");
        }
   
        {  //Instance Block
               speed=50;      //Instance variable initializer                                           
               System.out.println("Instance Block Executed...");
        }

        public static void main(String args[])
        {
                InstanceBlock b1=new InstanceBlock();
        }
}