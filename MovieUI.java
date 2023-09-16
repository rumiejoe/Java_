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

public class MovieUI
{
	private MovieContainer mc;
   private Scanner kb;
   
   /*
    *A constructor class.
   */
	public MovieUI(String dataFile) throws FileNotFoundException{
      mc = new MovieContainer(dataFile);
      kb = new Scanner(System.in);
   }
   
   
   /*
    * Gets user's menu choice and chooses action.
    *
   */
   public void run() throws FileNotFoundException{
      //Scanner kb = new Scanner(System.in);
      kb = new Scanner(System.in);
      int choice;						 // user's selection from the menu
      do {
			choice= menuChoice();
			if (choice==1)
				enterMovie();
			else if (choice==2){
				deleteMovie();
			}else if (choice==3)
				mc.display();
			else if (choice==4)
				searchByGenre();
			else if (choice==5)
				searchByTitle();
			else if (choice==6)
				searchByYear();
		} while (choice!=0);
      
      mc.save();
		System.out.println("\nTHE END");
	}


	/**
	 * Allow user to enter a new movie.
	*/
	public void enterMovie()
	{      
      //Scanner kb = new Scanner(System.in);
      kb = new Scanner(System.in);

      System.out.print("Enter movie title : ");
		String titles = kb.nextLine();
		System.out.print("Enter movie genre: ");
		String genre = kb.nextLine();
		System.out.print("Enter year of movie: ");
		int year = kb.nextInt();
      kb.nextLine();
      mc.insert(titles,genre,year);      
	}


	/**
	 * Displays menu and get's user's selection.
	 *
	 * @return the user's menu selection
	*/
	public int menuChoice()
	{
      //Scanner kb = new Scanner(System.in);
      kb = new Scanner(System.in);

      int choice;	 // user's selection

		System.out.println("\n\n");
		System.out.print("------------------------------------\n");
		System.out.print("[1] Add a Movie\n");
		System.out.print("[2] Delete a Movie\n");
		System.out.print("[3] List All Movies\n");
		System.out.print("[4] Search by Genre\n");
		System.out.print("[5] Search by Title\n");
		System.out.print("[6] Search by Year\n");
		System.out.print("---\n");
		System.out.print("[0] Exit Program\n");
		System.out.print("------------------------------------\n");
		do {
			System.out.print("Your choice: ");
			choice= kb.nextInt();
		} while (choice < 0 || choice > 6);

		return choice;
	}
   
   /**
    * Gets year from user and passes it to thesearch by year method 
    *in movie container.
   */
   public void searchByYear()
   {
      //Scanner kb = new Scanner(System.in);
      kb = new Scanner(System.in);

      int year; //year to be searched for 
      System.out.print("Enter year: "); //get year from user 
      year = kb.nextInt();
      kb.nextLine();
      mc.searchByYear(year); //pass year to movie container  
   }


   /**
    * Gets title from user and passes it to the search by title method 
    *in movie container.  
   */   
   public void searchByTitle()
   {
     // Scanner kb = new Scanner(System.in);
      kb = new Scanner(System.in);

      String title; //title to be searched for 
      System.out.print("Enter title: ");
      title = kb.nextLine();
      mc.searchByTitle(title);
   }

   /**
    * Gets genre from user and passes it to the search by genre method 
    *in movie container.  
   */
   public void searchByGenre()
   {
      //Scanner kb = new Scanner(System.in);
      
      kb = new Scanner(System.in);
      String genre; //genre to be searched for 
      System.out.print("Enter genre: ");
      genre = kb.nextLine();
      mc.searchByGenre(genre);
   }   


	/**
	 * Delete movies from the array.
	*/   
   public void deleteMovie()
   {
      //Scanner kb = new Scanner(System.in);
      kb = new Scanner(System.in);

      System.out.print("Enter id of item to delete: ");
      int id = kb.nextInt();
      mc.remove(id);
   }      
}
 