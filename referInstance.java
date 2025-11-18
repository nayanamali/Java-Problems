class referInstance
{
       int id;
       String name;
       String city;
    
       referInstance(int id,String name,String city)
       {
          this.id=id;
          this.name=name;
          this.city=city;
       }

       void display()
       {
           System.out.println("ID:" +id + " Name:" + name + " City:" + city);
       }
  
       public static void main(String args[])
       {
           referInstance r1=new referInstance(101,"Ram","Pune");
           r1.display();
           referInstance r2=new referInstance(101,"Ram","Pune");
           r2.display();
       }
}
          