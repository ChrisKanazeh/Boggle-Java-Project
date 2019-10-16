/*
Christopher Kanazeh
Boggle Project
Professor Whiting
COP 3330
 */

//package
package boggle;
//imports
import core.Board;
import inputOutput.ReadDataFile;
//import java.io.File;
//import java.net.URL;
import java.util.ArrayList;
import userInterface.BoggleUi;



/**
 *
 * @author Chris
 */
//public class
public class Boggle 
{
    
    //array to store the data, string to set the name of the input file
    private static ArrayList boggleData = new ArrayList();
    private static String dataFileName = new String("BoggleData.txt");
    private static String dictionaryFileName = new String("TemporaryDictionary.txt");
    
    /**
     * @param args the command line arguments
     */
    //main function
    public static void main(String[] args) 
    {
        //ArrayList dataFile;
        
        // TODO code application logic here
        //ReadDataFile call
        ReadDataFile data = new ReadDataFile(dataFileName);
        //call to populate data
        data.populateData();
        //boggle data set to get the data
            //CHANGED THIS!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            //boggleData = data.getData();
        
        ReadDataFile dictionary = new ReadDataFile(dictionaryFileName);
        dictionary.populateData();
        
        //sets the board equal to the board of boggle data
            //CHANGED THIS !!!!!!!!!!!!!!!!!!!!!!!!!!!!
            //Board board = new Board(boggleData);
        Board board = new Board(data.getData());
        //shake dice call
        //board.shakeDice();
        //boggleui call
        //BoggleUi boggleUi = new BoggleUi(board); 
        BoggleUi boggleUi = new BoggleUi(board, dictionary.getData());
        
    }
    
}
