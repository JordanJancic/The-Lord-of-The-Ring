package lab3_jordanjancic.pkg000269500;

/**
 * @author Jordan Jancic, 000269500
 * Lab 3
 * Professor: Mark Yendt
 * Date Completed: October 27, 2019
 *
 * 
 */
public class BookWord {
    
    private String text;                                                        //Tracks text of word.
    private int count = 0;                                                      //Tracks count of word.
    
    //The BookWord contructor sets the text of the word.
    public BookWord(String wordText) {
        
        this.text = wordText;
        
    }
    
    //A getter to get the text of the word.
    public String getText() {
        return text;
    }
    
    //A geter to get the count of the word.
    public int getCount() {
        return count;
    }
    
    //Increments the count of the word by 1.
    public void incrementCount() {
        count++;
    }
    
    //Overrises the equals method to compare hashcodes instead.
    @Override
    public boolean equals(Object wordToCompare) {
        
        
        return text.hashCode() == wordToCompare.hashCode();
        
    }
    
    //Overrised the HashCode method to implement a custom hashing algorithm.
    //The hashing algorithm used in this lab was found in this Youtube video: https://www.youtube.com/watch?v=jtMwp0FqEcg&t=207s
    @Override
    public int hashCode() {                                                     
        
    int g = 31;
    int hash = 0;
        for (int i = 0; i < text.length(); i++) {
            hash = g * hash + text.charAt(i);
        }
    return hash;
    }

    
    //Overrides the toSTring method to provide both text and word count.
    @Override
    public String toString() {
        return text + " : " + count;
    }
    
}