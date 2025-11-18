//this keyword as an argument to constructor

class ThisConDemo
{
         
            Thistest obj;

            public ThisConDemo(Thistest obj)        //it is used when we want to pass same value or data into multiple classes without need to create 
            {                                       //it for each classes
                   this.obj=obj;                
            }
 
            void info()
            {
                        System.out.println("Info data:" + obj.data);
            }
}
class demo2
{   
            Thistest obj1;
  
            public demo2(Thistest obj1)
            {
                    this.obj1=obj1;
            }
 
            void show()  
            {
                     System.out.println("Show data:" + obj1.data);
            }
}
class Thistest
{
            int data=50;
  
            Thistest()
            {
                     ThisConDemo d1= new ThisConDemo(this);      //First class with same data value
                     d1.info();
            
                     demo2 d2=new demo2(this);                  //Second class with same data value
                     d2.show();
            }
     
            public static void main(String args[])          
            {
                      Thistest a1=new Thistest();     //it can share single data to all classes using this keyword
            }
}
            
            
