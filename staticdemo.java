//static variable in java (share same copy of variable among all instance of class)
class staticdemo
{
        int id;
        String name;
        static String city="Pune";
 
        staticdemo(int id,String name)
        {
               this.id=id;
               this.name=name;
        }
        
        void show() 
        {
                 System.out.println("ID:" +id +" Name:" +name+ " City:" + city);
        }

        public static void main(String args[]) 
        {
                 staticdemo d1=new staticdemo(101,"Ram");
                 d1.show();
              
                 staticdemo d2=new staticdemo(102,"Shyam");
                 d2.show();
        }
}