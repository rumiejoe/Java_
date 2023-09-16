/**
 * A Rock, Paper, Scissors container that stores players 
 *
 *
 * @author Ojorumie Joe-Oka 
 * @version  26 February 2021 
 *
 *
 */


public class RPSPlayerContainer
{
   
   protected RPSPlayer [] players;
   protected int numPlayers;
 
   public RPSPlayerContainer(){
      players = new RPSPlayer[100];
   }
   
   /**
    * Adds players to the container 
    */
   public void add(RPSPlayer p){
      players[numPlayers] = p;
      numPlayers++;
   }
   
   /**
    *Displays all players in the container 
    */
   public void display(){
      for(int i=0; i<numPlayers; i++){
         players[i].display();
      }
   }

}