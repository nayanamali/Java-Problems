class SuperDetails
{
       int eid;
       String ename;
       String ecity;
       int eSalary;

       SuperDetails(int eid,String ename,String ecity,int eSalary)
       {
            this.eid=eid;
            this.ename=ename;
            this.ecity=ecity;
            this.eSalary=eSalary;
       }

       void displaydetails() 
       {
              System.out.println(" Employee id : " + eid + " Employee Name : " + ename + " Employee City : " + ecity + " Employee Salary : " + eSalary);
       }
}

class DetailSuper extends SuperDetails
{
        
        int Mid;
        String mname;
        String mCity;
        int mSalary;

        DetailSuper(int Mid,String mname , String mCity, int mSalary)
        {
             super(101,"Ram","Pune",25000);
             this.Mid=Mid;
             this.mname=mname;
             this.mCity=mCity;
             this.mSalary=mSalary;
        }

        void displaydetails()
        {
              super.displaydetails();
              System.out.println(" Employee id : " + Mid + " Employee Name : " + mname + " Employee City : " + mCity + " Employee Salary : " + mSalary);
        }
 
        public static void main(String args[])
        {
              DetailSuper d1= new DetailSuper(102,"Shyam","Mumbai",40000);
              d1.displaydetails();
        }
}  
              

