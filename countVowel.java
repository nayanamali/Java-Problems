class countVowel
{
        public static void main(String args[])
        {
             String str="Welcome";
             int vowels=0;
             int constant=0;

             String str2=str.toLowerCase();

             for(int i=0;i<str2.length();i++)
             {
                      char ch=str2.charAt(i);
 
                      if( ch >= 'a' && ch<='z')
                     {
                           if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                           {
                                  vowels++;
                           }

                           else
                           {
                                  constant++;
                           }

                     }
             }

             System.out.println("String Name : " + str);
             System.out.println("Vowels:" + vowels);
             System.out.println("Constants : " + constant);
        }
}