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
public enum Moods {
    MOOD_HAPPY(0),
    MOOD_SCARE(1);
    
    public final int id;

    private Moods(int id) {
        this.id = id;
    }
}
