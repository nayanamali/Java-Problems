/*class instancedemo
{
      {
         System.out.println("Instance initialization block");
      }

      instancedemo()
      {
         System.out.println("Default Constructor");
      }

      instancedemo(int x)
      {
         System.out.println("Parameterized Constructor:" + x);
      }
 
      public static void main(String args[])
      {
           instancedemo d1=new instancedemo();
           instancedemo d2=new instancedemo(10);
      }
}*/

/*class instancedemo
{
      String message;
     
      {
         message="Hello From instance Block";
      }

      instancedemo()
      {
         System.out.println("Instance initialization block " + message);
         System.out.println("Default Constructor");
         
      }

      instancedemo(int x)
      {
         System.out.println("Parameterized Constructor:" + x);
      }
 
      public static void main(String args[])
      {
           instancedemo d1=new instancedemo();
           instancedemo d2=new instancedemo(10);
      }
}*/


class multipleIIB
{
        
        int id;
        String name;
        String city;
        int a;
        int b;
    
        {
             System.out.println("Instance Initialization Block");
        }
        
        {
            a=10;
            System.out.println("value of a:" + a);
            b=20;
            System.out.println("value of a:" + b);
        }
     
        multipleIIB()
        {
             int add=a+b;
             System.out.println("Addition of a & b:" + add);
             int sub=a-b;
             System.out.println("Subtraction of a & b:" + sub);
        }
        {
              city="Pune";
        }
       
        multipleIIB(int id,String name)
        {
                this.id=id;
                this.name=name;
                System.out.println("ID:" +id + "Name:" + name + "City:" + city);
        }
   
        public static void main(String args[])
        {
               multipleIIB m1= new multipleIIB();
               multipleIIB m2=new multipleIIB(101,"Ram");
        }
}