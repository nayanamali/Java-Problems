class removeSpaces
{
      public static void main(String args[])
      {
           String str= " J  a  v  a ";

           /*int str1=str.length();

           System.out.println(str1);

           String s1=str.substring(0,3);

           System.out.print(s1);

           String s2=str.substring(3,6);

           System.out.print(s2);

           String s3=str.substring(6,9);

           System.out.print(s3);

           String s4=str.substring(9,12);

           System.out.println(s4);

           System.out.println(s1.trim()+s2.trim()+s3.trim()+s4.trim());*/

           String result=str.replace(" " ,"");

           System.out.println(result);
                      
      }
}