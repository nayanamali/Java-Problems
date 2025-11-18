class Cat extends Animal
{
       
       Cat(String name)
       {
            super(name);
       }
   
       void makeSound()                     //make modifiation into parent class method (makeSound)
       {
           System.out.println(name + " make sound meow");
       }

       public static void main(String args[])
       {
              Cat c1=new Cat("Cat");
              
              c1.eat();
          
              c1.makeSound();
       }
}