class Sample
{
            void display(Sample obj)            //Sample is data type that accept current object as argument(Same name as class name)
            {
                       System.out.println("Display Method is called...");
            }
     
            void show()
            {
                       System.out.println("Show Method is called...");
                       display(this);        //it passes this(that is current instance of class) as an argument
            }
           
            void info()
            {
                       System.out.println("Info Method is called...");
                       display(this);
          
            }
            public static void main(String args[])
            {
                     Sample s1=new Sample();
                     s1.show();
                     Sample s2=new Sample();
                     s2.info();
         
            }
}