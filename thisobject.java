class Sample
{
            void display(Sample obj)
            {
                       System.out.println("Display Method is called...");
            }
     
            void show()
            {
                       System.out.println("Show Method is called...");
                       display(this);        //it passes this(that is current instance of class) as an argument
            }
           
            public static void main(String args[])
            {
                     Sample s1=new Sample();
                     s1.show();
            }
}