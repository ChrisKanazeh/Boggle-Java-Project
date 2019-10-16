/*
Christopher Kanazeh
Boggle Project
Professor Whiting
COP 3330
 */
//package
package inputOutput;

//import boggle.*;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
// ReadDataFile class
public class ReadDataFile 
{
    //scanner for reading the file
    private Scanner input;
    //string for storing the file name
    private String dataFileName;
    //arraylist for storing the data from the file
    private ArrayList<String> data = new ArrayList<String>();
    
    //sets the string to the value passed in
    public ReadDataFile(String inFile)
    {
        dataFileName=inFile;
    }
    //populate data function
    public void populateData()
    {   //exception handler
        try
        {   //URL and File class to open the data file
            URL url = getClass().getResource(dataFileName);
            File file = new File(url.toURI());
            //sets input equal to the scanner file
            input = new Scanner(file);
            //loops through the file and adds the data to the array list
            while(input.hasNext())
            {
                data.add(input.next());
            }
        }   //catch exception handler
            catch(Exception ex)
            {
                    
            }
            //finally exception handler
            finally
            {
            input.close();
            }
        
    }

    //returns the data
    public ArrayList getData()
        {
        return data;
        }
}


