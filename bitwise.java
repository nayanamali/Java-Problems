class bitwise{
     
     public static void main(String args[])
     {
                 int no1=10;
                 int no2=9;
                 System.out.println("Bitwise AND of no1 & no2 :" + (no1 & no2));
                 System.out.println("Bitwise OR of no1 | no2 :" +(no1 | no2));
                 System.out.println("Bitwise XOR of no1 ^ no2 : " + (no1 ^ no2));    
                 System.out.println("Bitwise Complement of ~(no1): " + (~no1));       //formula= -(n+1)
                 System.out.println();
                 System.out.println("Shift Operators");
                 System.out.println("Bitwise right shift by 1:" + (no1>>1));   //4 bits
                 System.out.println("Bitwise right shift by 2:" + (no1>>2));
                 System.out.println("Bitwise left shift by 1:" + (no1<<1));    //8 bits  (always represent in 8 bits form)
                 System.out.println("Bitwise left shift by 2:" + (no1<<2));
       }
} 
