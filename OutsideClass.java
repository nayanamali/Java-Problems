class OutsideClass
{
         int id;
         String name;
   
         OutsideClass(int id,String name)
         {
               this.id=id;
               this.name=name;
         }

         void display()
         {
               System.out.println("ID of Student : " + id);
               System.out.println("Name of Student : " + name);
         }

         class InnerClass
         {
                  String city;
 
                  InnerClass(String city)
                  {
                         this.city=city;
                  }
 
                  void show()
                  {
                           System.out.println(" City of Student : " + city);
                   }
        
  
          }

         public static void main(String args[])
          {
                   OutsideClass outer=new OutsideClass(101,"Ram");
                 
                   OutsideClass.InnerClass i1= outer.new InnerClass("Pune");
 
                   i1.show();

                   outer.display();
          }
}