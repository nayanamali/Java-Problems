class Without_this{

              int id;
              String name;
              double marks;
 
              public Without_this(int id,String name,double marks)
              {
                     id=id;
                     name=name;
                     marks=marks;
 
              }
              public void display()
              {
                     System.out.println("ID: " + id +" Name: " + name +" marks: " + marks);
              }
              public static void main(String args[])
              {
                         Without_this s1=new Without_this();   //Default constructor is used to set default values to state of object (Variables of class)
                         s1.display();
                         Without_this s2=new Without_this();   //Default Constructor can set default values even if we create and does not create it
                         s2.display();
              }

}