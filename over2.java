class over
{
      int id;
      String name;
 
      over(int id,String name)
      {
          this.id=id;
          this.name=name;
      }
}
class over2 extends over
{
      String city;
     
      over2(String city)
      {
           super(101,"Ram");
           this.city=city;
      }
      public static void main(String args[])
      {
          over2 v2=new over2("Pune");
          System.out.println("ID:" + v2.id + "Name:" + v2.name + "City :" + v2.city);
      }
}