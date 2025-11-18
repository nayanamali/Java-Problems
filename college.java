//Display same college name for all students using static variable.
class college
{
       int id;
       String sname;
       static String college_name="NYNC";
 
       college(int id,String sname)
       {
              this.id=id;
              this.sname=sname;
       }

       void display()
       {
              System.out.println("ID:" +id + " Name:" + sname + " college_name:" + college_name);
       }
 
      public static void main(String args[])
      {
              college c1=new college(101,"Ram");
              c1.display();
              college c2=new college(102,"Shyam");
              c2.display();
      }
}