class StringBufferMethod
{
      public static void main(String args[])
      {
               StringBuffer sb=new StringBuffer("Hello World");
 
               System.out.println("Length of String: " + sb.length());          //length()

               System.out.println("Reverse of String: " + sb.reverse());        //reverse()

               System.out.println("Character at specific index of String: " + sb.charAt(6));    //charAt()
 
               sb.setCharAt(6,'M');

               System.out.println("Set Character at specific index of String: " + sb);   //setCharAt()
 
               System.out.println("Delete Character at specific index of String: " + sb.deleteCharAt(0));    //deleteCharAt()

               System.out.println("Index of l : " +  sb.indexOf("l"));       //indexOf() 
  
               System.out.println("Is Empty : " + sb.isEmpty());             //isEmpty()

               System.out.println("Reverse of String: " + sb.reverse());     //HellM Worl

               System.out.println("Hashcode of String: " + sb.hashCode());   //hashCode()

               System.out.println("Reverse of String: " + sb.substring(3,7));   //substring()

               System.out.println("Hashcode of String: " + sb.getClass());   //getClass() 

               
      }
}

               
