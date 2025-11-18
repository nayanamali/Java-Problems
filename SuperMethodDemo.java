//Super keyword is also used to execute parent class method throught calling it through instance method of child class


class Parent
{
           
  		 String message="Happy Diwali";
		
                 void eat()
                 {
                        System.out.println("I am eating Diwali Sweets");
                 }
}
class SuperMethodDemo extends Parent
{
                 String message="Everyone";
    
                 void eat()
                 {
                            super.eat();             //call parent class method into child class instance method using same method name as in parent class 
                            System.out.println("I like only Homemade Sweets");
                 }
                 void showMessage()
                 {
                           System.out.println(super.message);
                           System.out.println(message);
                 }
 
                 public static void main(String args[])
                 {
                          SuperMethodDemo s1 = new SuperMethodDemo();
                          s1.showMessage();
                          s1.eat();                //we can access method of both child and parent class
                 }
}