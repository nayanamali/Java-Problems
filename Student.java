class Student
{
            int rollno;
            String name;
             
            Student()
            {
                      rollno=101;
                      name="Ram";
            }
 
            void display()
            {
                  System.out.println("Student rollno:" +rollno);
                  System.out.println("Student Name:" +name);
            }

            public static void main(String args[])
            {
                  Student s1=new Student();
  	          s1.display();
            }
}