/*
Christopher Kanazeh
Boggle Project Assignment 1
6/19/2015
Professor Whiting
COP 3330
 */
//package
package core;
//imports
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Chris
 */
//public class die
public class Die {
    //constants
    private final int NUMBER_OF_SIDES = 6;
    //string to store the current letter of each die
    String currentletter;
    //array list to store the dice data for the sides
    private ArrayList<String> letters = new ArrayList<String>();
    //random letter function
    public void randomLetter()
    {
        //declares random class
        Random random = new Random();
        //generates random number
        int value = random.nextInt(NUMBER_OF_SIDES);
        //sets current letter to data stored at index of random number
        currentletter = letters.get(value);
    }
    //get letter function
    public String getLetter()
    {   //calls random letter
        randomLetter();
        //returns current letter
        return currentletter;
    }
    //add letter function
    public void addLetter(String letter)
    {
        //add the passed in value to array list
        letters.add(letter);
    }
    //display all letters function
    public void displayAllLetters()
    {
        //variable
        String newString;
        //loop through all the sides of the die
        for(int i=0; i < NUMBER_OF_SIDES; i++)
        {
            newString = letters.get(i);
        }
            
            
        //display the data
        for(String value : letters)
        {
                
                System.out.print(value + " ");
        }
    }
}
