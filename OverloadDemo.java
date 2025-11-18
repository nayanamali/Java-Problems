//method overloading :- that performs within in Single class
/Method Overlaoding means a same name function can be used for to perform multiple task knowns method oveloading.
//Method Overloading is achived through 1) Changing number of arguments 2) changing type of arguments
//access returntype functioname(type of arguments/number of arguments

//write a program method overloading by changing number of arguments

class OverloadDemo
{
   
        void show()
        {
                 System.out.println("Welcome to method Overloading");
        }
        void show(String name)
        {
                System.out.println(name + " Welcome to method Overloading");
        }
        void show(String name,String city)
        {
                System.out.println(name + "  Welcome to method overloading from " + city);
        }
        public static void main(String args[])
        {
                OverloadDemo o1= new OverloadDemo();
                o1.show();
                o1.show("Rahul");
                o1.show("Rahul","Mumbai");
        }
}
