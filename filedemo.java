class filedemo
{
     int id;
     String name;
     String city;
 
     filedemo(int id,String name,String city)
     {
         this.id=id;
         this.name=name;
         this.city=city;
     }
   
     void display()
     {
        System.out.println("ID:" + id + " Name:" + name + "City:" + city);
     }

     void show()
     {
          this.display();
     }

     public static void main(String aegs[])      
     {
          filedemo f1=new filedemo(101,"Ram","Pune");
          f1.show();
     }
}
        