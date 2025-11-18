class callsame
{
      int id;
      String name;
      String city;
    
      callsame(int id,String name)
      {
           this.id=id;
           this.name=name;
      }

      callsame(String city)
      {
           this(101,"Ram");
           this.city=city;
      }

      void display()
     {
      System.out.println("ID:" +id + " Name:" + name + "City:" +city);
     }

     public static void main(String args[])
     {
         callsame c2=new callsame("Pune");
         c2.display();
     }
}
   