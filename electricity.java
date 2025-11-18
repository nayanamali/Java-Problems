class electricity{
        
       public static void main(String args[])
       {
            int bill=00;
            if(bill<100)
            {
                       System.out.println("Low Usage");
            }
            else if((100<bill) && (bill<300))
            {
                       System.out.println("Medium Usage");
            }
            else if(bill>300)
            {
                       System.out.println("High Usage");
            }
            else
            {
                       System.out.println("Extremely Low usage");
            }
       }
}