class method1
{
       void show( method1 obj)
       {
           System.out.println("Hello World");
       }

       void show1()
       {
           show(this);
       }

       public static void main(String args[])
       {
            method1 m1=new method1();
            m1.show1();
       }
}



//this keyword is used to initialize intance variable of class or to access it
//this keyword also used to access instance method of class which call them explicityly using this keyword
//this keyword is also used to call consttructor of same class from another constructor
//this keyword is passed as argument to method and constructor
//this keyword also used to return current instance of class