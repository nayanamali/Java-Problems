//write a program method overloading by changing number of arguments
//method overloading is possible by changing signature of method 
//Signature of method changing through Changing number of arguments and  Changing types of argument
//Signature means type & count

//Even if we change return type of function than it does not provide any effect on method overloading

class OverloadDemo1
{
   
        void show(int id)            //(int id) defines signature of method
        {
                 System.out.println("Welcome to method Overloading " + id);
        }
        void show(String id)
        {
                System.out.println(id + " Welcome to method Overloading");
        }
        public static void main(String args[])
        {
                OverloadDemo1 o1= new OverloadDemo1();
                o1.show(10);
                o1.show("Rahul");
        }
}
