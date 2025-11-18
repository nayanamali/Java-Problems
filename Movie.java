class Movie{
    
                  String title;
                  String genre;
                  boolean isplaying;
                 
                  void play()
                  {
                                 System.out.println("Starts playing the movie");
                  }
                  void pause()
                  {
                                 System.out.println("Pause the movie");
                  }
              
                  public static void main(String args[])
                  {
                            Movie m1=new Movie();
                            m1.title="Shole";
                            m1.genre="Action";
                            System.out.print(m1.title + " is a " + m1.genre + " movie ");
                            m1.play();
                            Movie m2=new Movie();
                            m2.title="Chaava";
                            m2.genre="Action";
                            System.out.print(m2.title + " is a " + m2.genre + " movie ");
                            m2.pause();
                  }
 }