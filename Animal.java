//We can access properties of parent class and simlilary we acn make modification into that properties into child class

//Feacture of inheritance :- code reusability and modification

class Animal
{
        String name;
          
        Animal(String name)
        {
              this.name=name;
        }
   
        void eat()
        {
              System.out.println(name + " is eating");
        }
 
        void makeSound()
        {
              System.out.println(name + " is making sound");
        }
}
