//this keyword can be used to return reference of one class and which could be used  to access the data of that particular class

////when we want to return object of any class then we have need to create method of that class and set's it return type to particlar class name.

//A is Class Name :- Return Type

//getA() :- method name

//return this :- return object that sets to class name 'A'

// Can we able to call the method of another class without creating object?
//-> Yes, We can able to callthe method of another class without creating object by using this keyword as a reference.

class A
{
            A getA()
            {
                  return this;    
          
            }

            void message() 
            {
                   System.out.println("Helo Everyone...");
            }
}

class TestA
{
     
               public static void main(String args[])
               {
                          new A().getA().message();          //calling method of class A without creating object ( new A().getA() returns (object A))
               }                                             //A.message()
}     