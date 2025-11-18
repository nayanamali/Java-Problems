//what is default capacity of StringBuffer and how get increase in a program
class StringBufferDemo
{
        public static void main(String args[])
        {
              StringBuffer sb=new StringBuffer();       //default capacity 16
 
              sb.append("Welcome");

              System.out.println(sb.capacity());        //(previouscapacity+1) * 2

              sb.append("Welcome Everyone to fortune");

              System.out.println(sb.capacity());   //34

              StringBuffer sb1=new StringBuffer("Welcome To Fct"); 
       
              System.out.println(sb1.capacity());  //provides random capacity or size

              StringBuffer sb2=new StringBuffer(10);   //provides fixed size and capacity

              sb2.append("Welcome to Fct Pune");
       
              System.out.println(sb2.capacity());       

              
        }
}


