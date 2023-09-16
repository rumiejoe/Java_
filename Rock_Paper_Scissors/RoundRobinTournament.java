/**
 * A round robin tournament class to have every player face off with
 * every other player 
 *
 * @author Ojorumie Joe-Oka 
 * @version 5 March 2021
 *
 */


public class RoundRobinTournament extends RPSTournament
{
   public RoundRobinTournament(){
      super();
   }
   
   public void play(){
      for(int i=0; i<numPlayers; i++){
         for(int j=i+1; j<numPlayers; j++){
            players[i].fight(players[j]);
         }
      }
   }

}