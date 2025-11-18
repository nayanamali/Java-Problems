class Cart
{
      int Pid;
      String Pname;
      int count;
      int discount;
      int taxes;
      int ogprice;
      int finalAmount;

      Cart(int Pid ,  String Pname ,  int count , int discount , int taxes ,  int ogprice )
      {
              this.Pid=Pid;
              this.Pname=Pname;
              this.discount=discount;
              this.taxes=taxes;
              this.ogprice=ogprice;
              this.count=count;
      }

      void DisplayInfo()
      {
              System.out.println("Pid: " + Pid + " Product Name : " + Pname + " Total Count : " + count + " Price : " + ogprice + " Taxes : " + taxes + " Discount : " + discount);
      }

      void CalculateBill()
      {
              finalAmount= ogprice * count  ;  
              
              System.out.println( " Total Bill Including Discount & Taxes : " + finalAmount );
      }

      public static void main(String args[])
      {
              Cart c1=new Cart(101,"Trouser",2,20,30,250);
              c1.DisplayInfo();
              c1.CalculateBill();
      }
}
      