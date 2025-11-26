class StringBufferMethodEx
{

       public static void main(String args[])
       {
             StringBuffer str=new StringBuffer("Hello World");

             str.append("Hello World");

             System.out.println(str);

             System.out.println(str.capacity());

             System.out.println(str.length());
      
             System.out.println(str.charAt(2));

             str.setCharAt(6,'V');

             System.out.println(str);

             System.out.println(str.deleteCharAt(3));

             System.out.println(str.reverse());

             System.out.println(str.getClass());

             System.out.println(str.substring(4,8));

             System.out.println(str.isEmpty());
 
             System.out.println(str.indexOf("l"));
       }
}