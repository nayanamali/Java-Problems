class methodCall
{
    void show()
    {
          System.out.println("Show Method");
    }

    void show2()
    {
          show();
          System.out.println("Show2 Method");
    }
    public static void main(String args[])
    {
            methodCall c1=new methodCall();
           
            try
            {
                  c1.show2();
            }

            catch(Exception e)
           {
                System.out.println("Cannot call one method inside another method:" + e);
           }
    }
}

       