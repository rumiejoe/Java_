/**
 * Class file for movie inventory.
 *
 * @author  Ojorumie Joe-Oka
 * @version 13 February 2021
 *
 * <p>
 * This is a class file that consists of movie title, genre and year.
 * It also consists of two constructors.
 * </p>
 *
*/
import java.io.*;


public class Movie{
   private String title;
   private String genre;
   private int year;
   
   
   public Movie(){
      title = "null";
      genre = "null";
      year = 0;
   }
   
   /**
   * A constructor.
   *
   * @param title movie title
   * @param genre movie genre
   * @param year movie copyright date  
   */
   public Movie(String title, String genre, int year){
      this.title = title;
      this.genre = genre;
      this.year = year;
   }
   
   /**
   * Overriding the toString method to print in a preferred formatted style.
   */
   @Override
   public String toString(){
      return String.format("%-30s %-20s %4d\n",title,genre,year);      
   }
   
   
   /**
    * Writes to file indicated in the method call.
    * 
    * @param mine object to write to the data file
    */
   public void writeToFile(PrintStream mine){
   	mine.println(title);
		mine.println(genre);
		mine.println(year);
      
   }
   
   
   /**
    * @return movie copyright date
    */
   public int getYear(){
      return year;
   }
   
   
   /**
    * Checks to see if title searched for matches  any title in the array.
    *
    * @param searcher title to be searched for 
    * @return true or false
    */
   public boolean matchesTitle(String searcher){
      searcher = searcher.toLowerCase();
      return title.toLowerCase().contains(searcher);
   }
   
   
   /**
    * Checks to see if genre searched for matches any genre in the array.
    *
    * @param searcher genre to be searched for 
    * @return true or false
    */
   public boolean matchesGenre(String searcher){
      searcher = searcher.toLowerCase();
      return genre.toLowerCase().equals(searcher);
   }

   
}