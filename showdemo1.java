/*class showdemo1
{
        int id;
        String name;
 
        showdemo1(int id,String name)
        {
            this.id=id;
            this.name=name;
        }

        void display()
        {
            System.out.println("ID:" + id + " Name:" + name);
        }
 
        public static void main(String args[])
        {
                showdemo1 s1=new showdemo1(101,"Ram");
                s1.display();
        }
}*/

/*class showdemo1
{
        int id;
        String name;
 
        void show(int id,String name)
        {
              this.id=id;
              this.name=name;
        }
  
        void display()
        {
           this.show(102,"Ram");
           System.out.println("ID:" + id + " Name:" + name);
        }

        public static void main(String args[])
        {
             showdemo1 s1=new showdemo1();
             s1.display();
        }
}*/

/*class showdemo1
{
         int id;
         String name;
         showdemo1(int id)
         {
              this.id=id;
         }
 
         showdemo1(String name)
         {
                this(103);
                this.name=name;
         }

         void display()
         {
               System.out.println("ID:" + id + " Name:" + name);
         }

         public static void main(String args[])
         {
               showdemo1 s1=new showdemo1("Ram");
               s1.display();
         }
}*/

class showdemo1
{
           int id;
           String name;
           sdemo s1;
           showdemo1(int id,String name)
           {
               this.id=id;
               this.name=name;
           }
           showdemo1(sdemo s1)
           {
                 this(104,"Shaym");
                 this.s1=s1;
           }
        
           void display()
           {
                 System.out.println("ID" + s1.id + "Name:" + s1.name);
           }

}

class sdemo
{
          sdemo()
          {
                showdemo  s2=new showdemo(this);
                s2.display();
          }
       
          public static void main(String args[])
          {
               sdemo s1=new sdemo();
           }
}
                