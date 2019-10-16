/*
Christopher Kanazeh
Boggle Project
Professor Whiting
COP 3330
 */
//package
package core;
//import
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
//public class
public class Board {
    //set constants 
    private final int NUMBER_OF_DICE = 16;
    private final int NUMBER_OF_SIDES = 6;
    private final int GRID = 4;
    
    //stores all dice data
    ArrayList boggleData = new ArrayList();
    //stores all die data
    ArrayList<Die> boggleDice = new ArrayList<Die>();
    
    //stores all boggle data
    public Board(ArrayList inData)
    {
        
        boggleData = inData;
    }
    //populate data function
    private void populateDice()
    {
        //declare variable
        Die die;
        //loop through the dice
        for(int dice = 0; dice < NUMBER_OF_DICE; dice++)
        {
            //declare variable
            die = new Die();
            //loop through the sides
            for(int side = 0; side < NUMBER_OF_SIDES; side++)
            {
                //add the letters to the die
                die.addLetter(boggleData.get((dice * 6) + side).toString());
                
            }
            //prints out the data
            System.out.print("Die " + dice + ": ");
            die.displayAllLetters();
            System.out.println();
            //adds each die instance to the arraylist 
            boggleDice.add(die);
        }
    }
    
    //shake dice function
    public ArrayList shakeDice()
    {
        //counter
        int counter = 0;
        //populate dice call
        populateDice();
        //prints out the word boggle board
        System.out.println("Boggle board ");
        //loop through each dice
        for(Die die : boggleDice)
        {
            //increment counter by 1
            counter ++;
            //prints the letter for the grid
            System.out.print(die.getLetter() + " ");
            //prints the next line if mod equals 0
            if(counter % GRID == 0)
                System.out.println();
        }
        //returns boggle dice
        return boggleDice;
    }
    
}
