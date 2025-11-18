class parameterized{
    
                  int id;
                  String name;
                  double marks;
      
                  public parameterized(int i,String n,double d)
                  {
                            id=i;
                            name=n;
                            marks=d;
                  }
                  public void display()
                  {
                             System.out.println("ID:" + id +" Name: " +name +" marks: " +marks);
                  }
                  public static void main(String args[])
                  {
                             parameterized p1=new parameterized(10,"Akash",90.34); 
                             //parameterized constructor is used to set actual values to state of objects or variables of class
                             p1.display();
                             parameterized p2=new parameterized(11,"Ankita",80.34);
                             p2.display();
                  }
}
             