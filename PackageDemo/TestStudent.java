import package1.studeInfo;

class TestStudent
{
    public static void main(String args[])
    {
         studeInfo s1=new studeInfo();
         s1.setId(101);
         s1.setName("Ram");
         s1.setCity("Pune");
  
         System.out.println(s1.getId() + " " + s1.getName() + " " + s1.getCity());
    }
}