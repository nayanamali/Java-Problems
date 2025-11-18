package package1;

public class studeInfo
{
     private int id;
     private String name;
     private String city;

     //public getters and setters methods allow to read and write data
     public void setId(int id)
     {
           this.id=id;
     }

     public void setName(String name)
     {
           this.name=name;
     }

     public void setCity(String city)
     {
            this.city=city;
     }

     public int getId()
     {
             return id;
     }

     public String getName()
     {
             return name;
     }

     public String getCity()
     {
             return city;
     }

}