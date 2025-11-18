//hybrid Inheritance : multiple + hierachical
interface A
{
       int id=101;
   
}
interface B 
{
        String name="Ram";
        
}

class C implements A,B
{
        String city="Pune";

        void display()
        {
             System.out.println("ID:" +id + " Name:" + name + " City: " + city);
        }

}
class F extends C
{
        public static void main(String args[])
        {
               System.out.println("Hybrid Inheritance...");

               F f1=new F();
               f1.display();
        } 
} 