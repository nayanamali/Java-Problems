class StaticMethodDemo
{
                     int id;
                     String ename;
                     static String cname="FCTP";
    
                     StaticVariableDemo(int id,String ename)
                     {
                         this.id=id;
                         this.ename=ename;
                     }
 
                     void show()
                     {
                              cname="FCTS";
                              System.out.println("Employee ID: " +id + " Employee Name: " + ename +" Company Emp : " +cname);
                     }
                    
                     public static void main(String args[])
                     {
                            StaticVariableDemo d1=new StaticVariableDemo(101,"Ram");
                            StaticVariableDemo d2=new StaticVariableDemo(102,"Shyam");
                            d1.show();
                            d2.show();
                    }
}

//Static variable is a belongs to class means it can be change or access anywhere within class or in any method weather it is static or not

//Static Method: It Belongs to Class (Instance Method belongs to object)

//Static Method: To call Static Method It can be call directly without using object

//Static Method: A Static Data only access within Static method (Static Method Only acccept Static Demo)

//use of Static Method : 1) When we want to make changes into Static Data
                         //2)When we want to call  method without object of class