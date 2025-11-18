//Inner Class-(Local Inner class :- A class that is define inside a method of any class Known as Local Inner Class ( While Scope of this class is limited only for that method)
//Remember when a class place inside a method It's object must be created inside that method

class LocalInnerClassEx
{
       int a=10;
      
       void display()
       {
               System.out.println("Value of a:" + a);

               class LocalInner                                   //Local Inner Class
             {
               void show()
               {
                    System.out.println("Method of local class");
               }
            }

            LocalInner l1= new LocalInner();                     // Class object must be created within method 
            l1.show();
       }

       public static void main(String args[])
       {
               LocalInnerClassEx LI=new LocalInnerClassEx();
               LI.display();
       }
}
