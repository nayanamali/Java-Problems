class staticmethoddemo{
   
               int id;
               
               String name;
 
               static String city="Pune";

               staticmethoddemo(int id,String name) 
               {
                      this.id=id;
                      this.name=name;
               }
             
               static void show()
               {
                        System.out.println("Show details....");
                        city="Nagpur";            //aacess and modifies static data
               }

               void display()
               {
                        System.out.println("ID:" +id + " Name:" +name + " City:" +city);
               }
 
               public static void main(String args[])    //Can be called from static blocks or other static methods.
               {
                         show();      //Only one copy of a static method exists for all objects.
                         staticmethoddemo s1=new staticmethoddemo(101,"Ram");
                         s1.display();
                         
                         staticmethoddemo s2=new staticmethoddemo(102,"Shaym");
                         s2.display();
               }
}