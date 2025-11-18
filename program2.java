class program2
{
        program2()
        {
           System.out.println("Default Constructor");
        }
        program2(int a)
        {
            this();
            System.out.println("Parameterized Constructor");
        }

        public static void main(String args[])
        {
            program2 p2=new program2(10);
        }
}
         