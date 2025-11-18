//Chnaging Return Type of method

class ChangeReturnType
{
   
        int show(int id)            //(int id) defines signature of method
        {
                 System.out.println("Welcome to method Overloading " + id);
                 return 0;
        }
        void show(int id)           //error: method show(int) is already defined in class ChangeReturnType void show(int id)
        {
                System.out.println(id + " Welcome to method Overloading");
        }
        public static void main(String args[])
        {
               ChangeReturnType c1= new ChangeReturnType();
               c1.show(10);
        }
}