import bank.*;

public class CustomAccount
{
    public static void main(String args[])
    {
             Account a1=new Account(10000,123456789);
             a1.display();
             Customer c1=new Customer("Ram","ram12@gmail.com");
             a1.display();
    }
}