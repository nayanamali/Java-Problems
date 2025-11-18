//this keyword as an argument to method
class sampledemo
{
             int id;
             String name;
 
             public sampledemo(int id,String name)
             {
                         this.id=id;
                         this.name=name;
             }
 
             void display(sampledemo obj)
             {
                     System.out.println("Display Method.....");
                     System.out.println("ID:" +id + " Name:" + name);
             }
            
             void show()
             {
                     System.out.println("Show method.....");
                     display(this);                          //we can pass this keyword as an argument to any function  (this-> s1 data);
             }                                               //It can passes data of particular object to method        (s1.show())
 
             void info()            
             {
                     System.out.println("Info Method....");
                     display(this);                            //this -> s2 data    (s2.info())
             }
          
             public static void main(String args[])
             {
                  sampledemo s1=new sampledemo(101,"Ram");        
                  s1.show();
                  sampledemo s2=new sampledemo(102,"Shyam");
                  s2.info();
             }
}