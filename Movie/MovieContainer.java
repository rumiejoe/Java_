/**
 * Personal Movie Inventory System.
 *
 * @author  Ojorumie Joe-Oka
 * @version 13 February 2021
 *
 * <p>
 * This is the complete code for the object oriented version of the movie
 * inventory system.
 * </p>
 *
*/

import java.util.Scanner;
import java.io.*;

public class MovieContainer

{
   private Movie [] movies;
   private int numMovies;
	private String dataFile;
	public static final int MAXMOVIES= 10000;
   
   
   public MovieContainer(String dataFile) throws FileNotFoundException
   {
      movies = new Movie[MAXMOVIES];
      this.dataFile = dataFile;
      numMovies = 0;
      Scanner fIn = new Scanner(new FileInputStream(dataFile));
      
      while(fIn.hasNextLine()){
         movies[numMovies] = new Movie(fIn.nextLine(),fIn.nextLine(),fIn.nextInt());
         fIn.nextLine();
         numMovies++;
      }
   
   }    


	/*/**
	 * Allow user to enter a new movie.
	 *
	 * @param title movie title
	 * @param genre movie genre
	 * @param year movie copyright date
	*/
	public void insert(String title,String genre,int year)
	{
      movies[numMovies] = new Movie(title,genre,year);
      numMovies++;      
	}




	/**
    * Return number of movies in the array.
    *
	 * @return number of movies.
	*/
	public int size() throws FileNotFoundException
	{  
      return numMovies;
	}



	/**
	 * Displays all movie information.
	*/
	public void display()
	{
		System.out.println("------------------------------------------------");
		System.out.printf("%-30s %-20s %s\n","TITLE","GENRE","YEAR");
		for (int i=0; i<numMovies; i++){
			System.out.print(movies[i]);
	   }
   }

   
   /**
    * Search for and display movie copyrightdates that match year searched for during the method call. 
    *
	 * @param year movie year
   */
   public void searchByYear(int year)
   {
      System.out.println("Search By Year");
      System.out.print("------------------------------------\n");
      for(int i=0; i<numMovies; i++)
         if (movies[i].getYear()==year)
            System.out.print(movies[i]);      
   }


   /**
    * Search for and display titles that match what is searched for during the method call.  
	 *
    * @param title movie title
   */   
   public void searchByTitle(String title)
   {
      System.out.println("Search By Title");
      System.out.print("------------------------------------\n");
      //title = title.toLowerCase();//converts search term to lowercase to enable case insensitive search
      for(int i=0; i < numMovies; i++){
         if (movies[i].matchesTitle(title)){
            System.out.print(movies[i]);
         }
      }      
   }

   /**
    * Search for and display genre that match genre searched for during the method call.  
    *
	 * @param genre movie genre  
   */
  public void searchByGenre(String genre)
   {
      System.out.println("Search By Genre");
      System.out.print("------------------------------------\n");
      for(int i=0; i < numMovies; i++){
         if (movies[i].matchesGenre(genre)){
            System.out.print(movies[i]);    
         }
      }  
   }   


	/**
	 * Removes movie in the specified index from the array.
	 *
	 * @param index the index of the movie to be removed form the array
	*/   
  public void remove(int index)
   {
 		if(index>=0 && index<numMovies){
         for(int i=index; i<numMovies; i++){
            movies[i] = movies[i+1];
         }
         numMovies--;         
      }
   }


	/**
	 * Saves changes to the program and effects the changes on the file.
	*/   
   public void save() throws FileNotFoundException
   {
   PrintStream outfile = new PrintStream(dataFile);//opens the file
	for (int i=0; i<numMovies; i++){
      movies[i].writeToFile(outfile);
   }
   outfile.close();//closes the file 
   }
      
}
 