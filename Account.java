class Account{
 
                       int accountNumber;
                       String holderName;
                       double balance;
                 
                       void deposit()
                       {
                                System.out.println("Deposit Rs.5,000");
                       }
                       void withdraw()
                       {
                                System.out.println("Withdraw Rs.2,000");
                       }
                       public static void main(String args[])
                       {
                                  Account a1=new Account();
                                  a1.accountNumber=1234567;
                                  a1.holderName="Shweta Patil";
                                  a1.balance=25000.00;
                                  System.out.println("Account holder Name is " + a1.holderName + " with accountNumber " + a1.accountNumber + " total balance "+ a1.balance);
                                  a1.deposit();
                                  a1.withdraw();
                      }
}