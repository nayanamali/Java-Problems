import package1.demo1;
import package2.demo2;

class TestPackage
{
      public static void main(String args[])
      {
          demo1 d1=new demo1();
          d1.show();

          demo2 d2=new demo2();
          d2.display();
      }
}

If we want to access data of specific class than we use import pacakgename/folderName.ClassName

If we want to access data of all classes precent into folder or package than we use ( * ) operator

to use (*) operator -> syntax [ import pacakgeName / FolderName . * ]

Example import nayana.*;

Access Specifier:- Default,Private,Public,Protected

Default,Private,Public,Protected access specifire will be applied to methods and variables

while default and public shound be apply to Class

for example , If we have water supply than it can be access by any one than it is public

similarly, If we have a TV than it can be seen by only by person we know that is relatives can access it than it is Protected

similarly,If we have mobile phone than it can access only by its owner not by others than it is private