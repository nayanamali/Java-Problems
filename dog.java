class Dog extends Animal
{
       
       Dog(String name)
       {
            super(name);
       }
   
       void makeSound()                     //make modifiation into parent class method (makeSound)
       {
           System.out.println(name + " make sound Bhow");
       }

       public static void main(String args[])
       {
              Dog d1=new Dog("Dog");
              
              d1.eat();
          
              d1.makeSound();
       }
}


//Inheritance can provide dynamic data based on object 