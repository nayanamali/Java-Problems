class swichdemo{
    
      public static void main(String args[])
      {
            System.out.println("Enter Menu is:");
            System.out.println("1.Cricket");
            System.out.println("2.Football");
            System.out.println("3.Pocker");
            System.out.println("4.Vollyball");
            System.out.println("5.Snocker");
            System.out.println();
            int select_menu=3;
            System.out.println("Selected Menu: " +select_menu);
            switch(select_menu)                                  //which type of argument switch accept:-any type of argument(int,string,float,char)
            {
                 case 1: 
                        System.out.println("Your Menu is Cricket");
                        break;
                 case 2: 
                        System.out.println("Your Menu is Football");
                        break;
                 case 3: 
                        System.out.println("Your Menu is Pocker");
                        break;
                 case 4: 
                        System.out.println("Your Menu is Vollyball");
                        break;
                 case 5: 
                        System.out.println("Your Menu is Snocker");
                        break;
                 default:
                        System.out.println("Invalid Menu");
                        break;
            }
                 
      }
}