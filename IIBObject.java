class IIBObject
{
       static int Counter;
       {
               Counter++;
       }
      
       IIBObject()
       {
            System.out.println("Onbject Number:" + Counter);
       }

       public static void main(String args[])
       {
            IIBObject i1=new IIBObject();
            IIBObject i2=new IIBObject();
            IIBObject i3=new IIBObject();
       }
}