class InheritanceEx
{

     int id;
     String name;

     void set(int id,String name)
     {
           this.id=id;
           this.name=name;
     }

}
class TestIn extends InheritanceEx
{
        String city="Pune";

        void display()
        {
              System.out.println("Id : " + id + " Name : " + name + " City: " + city);
        }

        public static void main(String args[])
        {
              TestIn t1=new TestIn();
              t1.set(101,"Ram");
              t1.display();
        }
}