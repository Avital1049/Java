/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeexercise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Avital
 */
public abstract class Animal {
    
    protected boolean mammals;
    protected boolean carnivorous;
    protected int mood;
    public final int MOOD_HAPPY= Moods.MOOD_HAPPY.id;
    public final int MOOD_SCARE= Moods.MOOD_SCARE.id;
    
    //The list contains the way of the animals to say hello
    protected final List<String> moodList= new ArrayList<String>(){{
        add("wagging tail");
        add("make meow~ sound");
        add("null");
    }};
    

    
    public Animal(boolean mammals,boolean carnivorous,int mood){
        setMammels(mammals);
        setCarnivorous(carnivorous);
        setMood(mood);
    }
    
    //How the animal usually great people
    public void sayHello(){}
    
    //The animal behavior in a specific mood
    public abstract void sayHello(int mood);
    
    public boolean isMammels(){
        return mammals;
    }
    
    public boolean isCarnivorous(){
        return carnivorous;
    }
    
    public void setMammels(boolean mammals){
        this.mammals= mammals;
    }
    
    public void setCarnivorous(boolean carnivorous){
        this.carnivorous= carnivorous;
    }
    
    public void setMood(int mood){
        this.mood= mood;
    }
}
