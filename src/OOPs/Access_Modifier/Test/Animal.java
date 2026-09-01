package OOPs.Access_Modifier.Test;

public class Animal {

     private String name ;

     private String sound ;

     public Animal( String name , String sound){
         this.name = name;
         this.sound = sound;
     }

     public void makeSound(){
         System.out.println(name + " makes sound : " + sound);
     }

     protected void changeSound(String newSound){
         this.sound = newSound ;
     }
     // only those objects which are created by the classes extending animal class can use this method


}
