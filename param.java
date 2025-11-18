class param
{
                    int id;
                    String name;
                    double salary;
 
                    param()                                       //Default Constructor
                    {
                            id=101;                       
                            name="Shyam";
                            salary=30000.00;
                    }
                    param(int no,String ename,double sal)         //Parameterized Constructor
                    {
                            id=no;
                            name=ename;
                            salary=sal;
                    }
  
                    void display()
                    {
                         System.out.println("ID:" +id +" Name:" + name + " Salary:" + salary);
                    }
 
                    public static void main(String args[])
                    {
                           param p2=new param();
                           param p1=new param(101,"Ram",24000.00);
                           p2.display();
                           p1.display();

                     }
}
  