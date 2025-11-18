class program3
{
      prodemo obj;
  
      program3(prodemo obj)
      {
         this.obj=obj;
      }

      void show()
      {
          System.out.println("Value of current object:" + obj.data);
      }
}
class prodemo
{
     int data=10;
     public static void main(String args[])
     {
           prodemo p2=new prodemo();
           program3 p1=new program3(p2);
           p1.show();
     }
} 