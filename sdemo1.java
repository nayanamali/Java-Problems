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

/*class showdemo1
{
           sdemo obj;
           showdemo1(sdemo obj)
           {
                 this.obj=obj;
                 System.out.println("ID : " + obj.id + " Name:" + obj.name);
           }
        
}

class sdemo
{
          int id=101;
          String name="Ram";
          sdemo()
          {
                showdemo1  s1=new showdemo1(this);
          }
       
          public static void main(String args[])
          {
               sdemo s2=new sdemo();
             
           }
}
*/

/*class sdemo1
{
        void display( sdemo1 s1)
        {
              System.out.println("Display This");
        }

        void show()
        {
             display(this);
             System.out.println("Show this");
        }

        public static void main(String args[])
        {
              sdemo1 s1=new sdemo1();
              s1.show();
        }
} */

class sdemo1
{
          sdemo1 getA()
          {
               return this;
          }
          void message()
          {
                System.out.println("Show demo");
           }

          public static void main(String args[])
          {
                new sdemo1().getA().message();
          }
}               