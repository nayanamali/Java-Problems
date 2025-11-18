class StringFunctionDemo
{
           public static void main(String args[])
           {
                String city="Mumbai";
                System.out.println("Character at 5th position: " +city.charAt(5));

                String Firstname="Nayana";
                String Lastname="Mali";
                System.out.println( "Concate FirstName and LastName: " + Firstname.concat(" ").concat(Lastname));

                String str1="Hello";
                String str2="hello";
                System.out.println(str1.equalsIgnoreCase(str2));

                String sub="I love Java Programming";
                System.out.println(sub.substring(7,11));
                System.out.println(sub.charAt(0));
                System.out.println(sub.charAt(22));

                String sub1="WelcomeHome";
                System.out.println(sub1.substring(7));

                String sub2="Chai";
                System.out.println(sub2.charAt(2));

                String str3="Good Morning";
                System.out.println(str3.toUpperCase());

                String str4="JAVA IS FUN";
                System.out.println(str4.toLowerCase());

                String str5="Hello World";
                System.out.println(str5.substring(6));

                String str6="Java is fun .com";
                System.out.println(str6.contains("Java"));

                System.out.println(str6.substring(0,4));
                System.out.println(str6.substring(12,16));
           }
}