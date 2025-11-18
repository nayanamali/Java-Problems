class StaticInc
{
        static int counter=0;

        static void increment(int counter)
        {
           this.counter=counter;    //non-static variable this cannot be referenced from a static context (this.counter=counter);
        }
   
        void display()
        {
              System.out.println("Counter:" + counter);
        }
        public static void main(String args[])
        {
               StaticInc i1=new StaticInc();
               //i1.increment();
               //i1.increment();
               i1.increment(10);
               i1.display();
        }
}


//static variable are used to share same copy of data present into variables among all instance of the objects

//static methods are used for to access and update static data

//Satic block is used for to initialize Static Variables and it always executed before main method