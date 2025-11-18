class StaticVariableDemo2
{
             int count=0;   //instance variable
            
             static int count1=0; //Static Vraible

             StaticVariableDemo2()
             {
                      count++;
                      System.out.println("Value of Instance count:" + count);
                      count1++;
                      System.out.println("Value of Static count:" + count1);
             }
             
             public static void main(String args[])
             {
                  StaticVariableDemo2 d1= new StaticVariableDemo2();  //Instance Variable can create a seperate copy for each object of class (Value of count remain same for each object)
                  StaticVariableDemo2 d2= new StaticVariableDemo2();  //Static varaible can share common value for each object of class (Value of count1 increment when static )
                  StaticVariableDemo2 d3= new StaticVariableDemo2();
             }
}

//Heap memory maintains seperate copy for each instance variable

//Stack memory maintains same copy for Static Variable

//Static Vraiable can commonly Share with each object 

//Where Instance Variable maintains :Heap memory

//where Static variable maintains :Static memory (Class Level Memory)

//what is static keyword in java

//Static Keyword can be used with class,Variable,Method,blocks.

//Now ,Static Varibale: Static Variable is a class level Variable which belongs to class not to object .It is variable which can share same copy of Varible among all instance or objects of class 