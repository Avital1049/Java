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
public class Frog extends Animal implements Land, Water{
    
    private int numberOfLegs;
    private boolean hasGills;
    private boolean laysEggs;

    public Frog(boolean mammals, boolean carnivrous, int mood,int numLegs,boolean hasGills, boolean laysEggs) {
        super(mammals, carnivrous, mood);
        setNumberOfLegs(numLegs);
        setHasGills(hasGills);
        setLaysEggs(laysEggs);
    }

    @Override
    public void sayHello(int moodId) {
       if(moodId == MOOD_HAPPY)
            System.out.println("My behavior when I'm in happy mood is to sing qoaq on shore");
       else
            System.out.println("My behavior when I'm in scare mood is to plop into the water");
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public boolean hasGills() {
        return hasGills;
    }

    @Override
    public boolean hasLaysEggs() {
        return laysEggs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setHasGills(boolean hasGills) {
        this.hasGills = hasGills;
    }

    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs;
    }
    
    
    
}
