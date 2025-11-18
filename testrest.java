class Staff
{
     void work()
     {
           System.out.println("Staff Works");
     }
}
class Doctor extends Staff
{
     void work()
     {
           System.out.println("Doctor is diagnosing patients");
     }
}
class Nurse extends Staff
{
     void work()
     {
           System.out.println("Nurse is administering medications");
     }
}
class Receptionist extends Staff
{
     void work()
     {
           System.out.println("Receptionist is managing appointments");
     }
}
class testrest
{
     public static void main(String args[])
     {
            Staff s1=new Doctor();
            s1.work();
            Staff s2=new Nurse();
            s2.work();
            Staff s3=new Receptionist();
            s3.work();
     }
}
    