/**
 * A Rock, Paper, Scissors player that allows both human
 * and computer players 
 *
 * @author  Terry Sergeant
 * @version for P2
 *
*/

import java.util.Scanner;
public abstract class RPSPlayer
{
	private String name; // player's name
	private int wins;    // number of wins since last reset
	private int losses;  // number of losses since last reset

	public RPSPlayer(String name)
	{
		this.name= name;
		wins= losses= 0;
	}


  /**
   * Human player chooses pose from a menu.
   *
   * @return The code for the pose (0=Rock, 1=Paper, 2=Scissors)
  */
	public abstract int pose();

	/**
	 * @return name of the player
	 */
	public String toString()
	{
		return name;
	}

	/**
	 * Restore wins and losses to zeroes.
	 */
	public void reset() { wins= losses= 0; }


	/**
	 * Getter for name.
	 * @return player's name
	 */
	public String getName() { return name; }


	/**
	 * Getter for wins.
	 * @return number of wins
	 */
	public int getWins() { return wins; }


	/**
	 * Getter for losses.
	 * @return number of losses
	 */
	public int getLosses() { return losses; }



	/**
	 * Present player name along with win/loss record.
	 */
	public void display()
	{
		System.out.printf("%-15s: %2d-%2d\n",name,wins,losses);
	}


	/**
	 * Have this player take on another player showing results and updating
	 * win/loss records for each player.
	 */
	public void fight(RPSPlayer other)
	{
		int me,them;

		// get poses
		me= this.pose();
		them= other.pose();

		// announce poses
		System.out.println(name+" throws "+translate(me)+" ...");
		System.out.println(other.name+" throws "+translate(them)+" ...");

		// announce winner and update win/loss records
		if (me==them){
         do{
         me= this.pose();
		   them= other.pose();
         
         System.out.println(name+" throws "+translate(me)+" ...");
		   System.out.println(other.name+" throws "+translate(them)+" ...");
         }while(me==them);
         if (them==(me+1)%3)
			{
				System.out.println(other.name+" wins!");
				this.losses++;
				other.wins++;
			}
			else
			{
				System.out.println(this.name+" wins!");
				this.wins++;
				other.losses++;
			}

		}else
		{
			if (them==(me+1)%3)
			{
				System.out.println(other.name+" wins!");
				this.losses++;
				other.wins++;
			}
			else
			{
				System.out.println(this.name+" wins!");
				this.wins++;
				other.losses++;
			}
		}
	}


	/**
	 * Converts a pose code into the appropriate string.
	 * @param code either 0, 1, or 2
	 * @return a String where 0=rock, 1=paper, 2=scissors
	 */
	public static String translate(int code)
	{
		switch (code)
		{
			case 0 : return "Rock";
			case 1 : return "Paper";
			case 2 : return "Scissors";
  			default: return "Invalid code";
		}
	}
   
   /**
    * Method to compare between two players based on their names 
    *
    * returns value of comparison
    */ 
   public int compareTo(RPSPlayer p){
      if(this.wins > p.wins || p.wins > this.wins){
         return this.wins-p.wins;
      }else //if(this.wins == p.wins){
         return p.losses - this.losses;
      //}
   }
}
