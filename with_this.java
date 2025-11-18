class with_this{

              int id;
              String name;
              double marks;
 
              public with_this(int id,String name,double marks)
              {
                     this.id=id;
                     this.name=name;
                     this.marks=marks;
 
              }
              public void display()
              {
                     System.out.println("ID: " + id +" Name: " + name +" marks: " + marks);
              }
              public static void main(String args[])
              {
                         with_this s1=new with_this(101,"Ram",98.23);   //Default constructor is used to set default values to state of object (Variables of class)
                         s1.display();
                         with_this s2=new with_this(102,"Shaym",90.34);   //Default Constructor can set default values even if we create and does not create it
                         s2.display();
              }
}