//print grade of the student based on it's percentage  per>65 grade is c per>75 grade is b per>90 grade is A

class grade{
     
          public static void main(String args[])
          {
                int per=85;
                if (per>90)
                {
                   System.out.println("Grade A");
                } 
                else if (per>75)
                {
                   System.out.println("Grade B");
                }  
                else if (per>65)
                {
                   System.out.println("Grade C");
                }
                else
                {
                    System.out.println("Fail"); 
                }
           }
}   