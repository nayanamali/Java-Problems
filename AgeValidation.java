class AgeValidation
{
    public void valid(int age)
    {
           if(age<18)
           {
                throw new ArithmeticException("Age of voter 18+");
           }

           else
           {
                System.out.println("Valid Voter");
           }
    }


    public static void main(String args[])
    {
             AgeValidation a1=new AgeValidation();
             a1.valid(14);
    }
}