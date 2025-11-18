//Initialize static variable using static block. //Use static block to set value of appName before main executes.

class initstatic
{
             String appState;
             static String appName;
  
             static
             {
                 appName="Chrome";
             }
   
             initstatic(String appState)
             {
                 this.appState=appState;
             }
             void display()
             {   
                  System.out.println("AppName:" +appName +" AppState:" +appState);
             }
             public static void main(String args[])
             {
                    initstatic i1=new initstatic("Running");
                    i1.display();
                    initstatic i2=new initstatic("Paused");
                    i2.display();
                    initstatic i3=new initstatic("Stopped");
                    i3.display();
            }
}
                    