package lotrWordCounter;

import java.text.DecimalFormat;

/**
 *
 * @author Jordan
 */
public class Character {
    
    private String name;                                                        //Stores the character name.
    private int count;                                                          //Stores the count of the character.
    private int proximityCount;                                                 //Stores the proxmimity value for this character.
    private double closenessFactor = 0;                                         //Stores the calculated closeness factor.
    
    //The contructor for the Character class. Sets the name and count.
    public Character(String name) {
        
        this.name = name;
        count++;
    }
    
    //Increments the count of the Character object.
    public void incrementCount() {
        count++;
        updateCloseness();
    }
    
    //Increments the proximity count.
    public void addToProximityCount(int count) {
        proximityCount += count;
        updateCloseness();
    }
    
    //A getter to get the name of the character.
    public String getName() {
        return name;
    }
    
    //A getter to get the count of the Character.
    public int getCount() {
       return count;
    }
    
    //A getter to get the proximity count of the character.
    public int getProximityCount() {
       return proximityCount;
    }
    
    //A getter to get the closeness factor of the character.
    public double getCloseness() {
        return closenessFactor;
    }
    
    //A method that updates the closeness factor of the character.
    public void updateCloseness() {
        closenessFactor = (double)proximityCount / (double)count;
    }
    
    //Overrises the equals method to compare hashcodes instead.
    @Override
    public boolean equals(Object wordToCompare) {
        
        return name.hashCode() == wordToCompare.hashCode();
        
    }
    
    //Overrised the HashCode method to implement a custom hashing algorithm.
    //The hashing algorithm used in this lab was found in this Youtube video: https://www.youtube.com/watch?v=jtMwp0FqEcg&t=207s
    @Override
    public int hashCode() {
        
    int g = 31;
    int hash = 0;
        for (int i = 0; i < name.length(); i++) {
            hash = g * hash + name.charAt(i);
        }
    return hash;
    }
    
}
