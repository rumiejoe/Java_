/**
 * Source file 
 *
 * @author  Ojorumie Joe-Oka
 * @version 13 February 2021
 *
 * <p>
 * This is a source file that will work with the Movie class.
 * </p>
 *
*/
import java.io.*;


public class Driver{
   public static void main(String [] args) throws FileNotFoundException{
      MovieUI mui = new MovieUI("../data/tinymovielist.txt");  
      mui.run();     
   }
}