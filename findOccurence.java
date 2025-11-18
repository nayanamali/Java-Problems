class findOccurence
{
         public static void main(String args[])
         {
             String str=" Hello Java ";
             System.out.println(str);
             System.out.println(str.trim());

             String str2= "Dog is PetAnimal Dog can Eat Dog can smell";
             System.out.println(str2.replace("Dog","Cat"));

             String str3 = String.join("," ,"This" ," is"," Java");
             System.out.println(str3);

             String str4=String.join(" " , "J","a","v","a","i","s","f","u","n");
             System.out.println(str4);

             String arr[]={"Pune","Kolhapur","Mumbai","Latur","Delhi","Kasara"};
             String str5=String.join(" | " , arr);
             System.out.print(str5);
                
          } 
}