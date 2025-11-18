class TestMutable
{
          public static void main(String args[])
          {
                String s1=new String("Hello"); //immutable String
 
                s1.concat(" Krishna");
 
                System.out.println(s1);

                StringBuffer sb=new StringBuffer("Hello");  //mutable String
 
                sb.append(" Krishna");
 
                System.out.println(sb);
   
                StringBuilder sb1= new StringBuilder("Hello");     //mutable String
 
                sb1.append(" Krishna");
 
                System.out.println(sb1);
          }
}