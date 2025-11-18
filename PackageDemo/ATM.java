class ATM
{
        public static void main(String args[])
        {
               AccountDemo a1=new AccountDemo();
               System.out.println(a1.getbalance()); 
               System.out.println(" My current Balance is " + a1.DepositeAmt(100000));
               System.out.println(" My Available Balance is " + a1.WithDrawlAmt(15000));
        }
}
               
