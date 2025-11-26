class CountVowelConstanst
{
       public static void main(String args[])
       {
            String str="Welcome to java";

            String str2=str.toLowerCase();

            int vowels=0;
            int Constants=0;

            for(int i=0;i<str2.length();i++)
            {
                 char ch=str2.charAt(i);

                 if(ch >= "a" && ch <= "u")
                 {
                        vowels++;
                 }

                 else
                 {
                       Constants++;
                 }
           }

           System.out.println("Total Vowels: " + vowels);
           System.out.println("Constant : " + Constants);

      }

}