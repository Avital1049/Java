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
public class Cat extends Animal implements Land{
    
    private int numberOfLegs;

    public Cat(boolean mammals, boolean carnivrous, int mood,int numberOfLegs) {
        super(mammals, carnivrous, mood);
        setNumberOfLegs(numberOfLegs);
    }

    @Override
    public void sayHello() {
        System.out.println("My way to say hello is: " + moodList.get(mood));
    }
    
    

    @Override
    public void sayHello(int moodId) {
      if(moodId == MOOD_HAPPY)
            System.out.println("My behavior when I'm in happy mood is to make purr sound");
       else
            System.out.println("My behavior when I'm in scare mood is to make hiss sound");
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    
}
