/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeexercise;

/**
 *
 * @author Avital
 */
public class HomeExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create an array with our animals
        Animal animals[]= new Animal[3];
        animals[0]= new Dog(true, true, AnimalsIDs.DOGID.id, 4);
        animals[1]= new Cat(true, true, AnimalsIDs.CATID.id, 4);
        animals[2]= new Frog(false, false, AnimalsIDs.FROGID.id, 4, true, true);
        
        for (Animal animal : animals) {
            //Print the animal name
            System.out.println("Hello! I am a " + animal.getClass().getSimpleName());
            
            //if live on the land
            if (animal instanceof Land) {
                System.out.println("I have " + ((Land) animal).getNumberOfLegs() + " legs");
            }
            
            //if live in water
            if (animal instanceof Water) {
                System.out.println("I have gills? " + ((Water) animal).hasGills());
                System.out.println("I lays eggs? " + ((Water) animal).hasLaysEggs());
            }
            
            System.out.println("Am I a mammal? " + animal.isMammels());
            System.out.println("Am I a carnivorous? " + animal.isCarnivorous());
            
            //The animal way to say hello- if exists
            animal.sayHello();
            
            //The animal way to say hello- 
            //In happy mood-
            animal.sayHello(animal.MOOD_HAPPY);
            //In scare mood-
            animal.sayHello(animal.MOOD_SCARE);
            
            System.out.println("********************************************************\n");
        }
        
    }
    
}
