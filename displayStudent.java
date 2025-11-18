class  displayStudent{
 
                   int rollno;
                   String name;
                   String course;
                   float fee;

                   displayStudent(int rollno,String name)
                  {
                             this.rollno=rollno;
                             this.name=name;
                  }
                   displayStudent(int rollno,String name,String course)
                  {
                       this(rollno,name);         //reusing constructor
                       this.course=course;
                  }
                  displayStudent(int rollno,String name,String course,float fee)
                  {
                         this(rollno,name,course);       //this is called constructor chaining 
                         this.fee=fee;     
                  }
                  void displayinfo()
                  {
                             System.out.println("Rollno: " + rollno + " Name: " +name + " course :" + course + " fee : " + fee);
                  }

               public static void main(String args[])
                  {
                         displayStudent s1=new displayStudent(101,"Ram","BCA");  
                         displayStudent s2=new displayStudent(102,"Shaym","BCS",100000); 
                         s1.displayinfo();
                         s2.displayinfo();

                                
                  }
}
          