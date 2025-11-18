//Interface is allow us to achieve 100% abstraction
//All methods in Interface are by deafualt abstract till java 8
//from Java 8 :- It allow us to write Static and Default Methods
//From Java 8 :- It allow us to write private methods

//we can able to write non-abstract methods in Interface?
//Yes we can write non-abstract methods in Interface like Static method,default method,Private method

//What is an Interface? -> Interface is a simple Structure like as a Class which contains abstract methods as well as non-abstract Method. till Java 8, It 
// contains only abstract methods. In Interface , All methods are by default abstract means we do not need to use abstract keyword to create abstract method.

//All Abstract methods of Interface must be overriden but  there was a problem when we want to execute only one Functionality (only one method ) and not other Functionality (method) .

interface Shape
{
        void draw();
        void display();
        default void run()
        {
               System.out.println("Run Program");
        }
}
class Circle implements Shape
{
        public void draw()
        {
              System.out.println("Draw Circle");
        }

        public void display()
        {
              System.out.println("Display Cirle");
        }

}
class Square implements Shape
{
        public void draw()
        {
            System.out.println("Draw Square");
        }
        public void display()
        {
              System.out.println("Display Cirle");
        }

}

class TestInterfaceDemo
{
        public static void main(String args[])
        {
              Shape s1=new Circle();
              s1.draw();
              s1.display();
              s1.run();
              Shape s2=new Square();
              s2.draw();
              s2.display();
        }
}