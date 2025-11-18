package bank;

public class Customer
{
    String name;
    String email;

    Customer(String name,String email)
    {
         this.name=name;
         this.email=email;
    }

    public void display()
    {
       System.out.println("Name:" + name + " Email:" + email);
    }
}     