class Student1
{
       String name;
       int rollno;
       double marks;
  
       void AssignValue(String name,int rollno,double marks)
       {
              this.name=name;
              this.rollno=rollno;
              this.marks=marks;
       }
       
       void displayInfo()
       {
               System.out.println("Name: " + name + " Rollno:" + rollno + " Marks:" + marks);
        }

             
       public static void main(String args[])
       {
           Student1 s1=new Student1();
           s1.AssignValue("Ram",101,80.20);
           s1.displayInfo();
           Student1 s2=new Student1();
           s2.AssignValue("Shyam",102,90.70);
           s2.displayInfo();
           Student1 s3=new Student1();
           s3.AssignValue("Shweta",103,85.00);
           s3.displayInfo();

           if(s1.marks>=s2.marks && s1.marks>=s3.marks)
           {
                   System.out.println(s1.name + " is the student with highest marks");
           }
           if(s2.marks>=s1.marks && s2.marks>=s3.marks)
           {
                   System.out.println(s2.name + " is the student with highest marks");
           }
           if(s3.marks>=s2.marks && s3.marks>=s1.marks)
           {
                   System.out.println(s3.name + " is the student with highest marks");
           }

       }
}
    
       