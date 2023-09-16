/**
 * Driver to test
 *
 *
 */


public class driverForTest
{
   public static void main(String [] args){
      RoundRobinTournament A = new RoundRobinTournament();
      
      ComputerRPSPlayer a = new ComputerRPSPlayer("Rumie");
      ComputerRPSPlayer b = new ComputerRPSPlayer("Lukie");
      ComputerRPSPlayer c = new ComputerRPSPlayer("Frances");
      ComputerRPSPlayer d = new ComputerRPSPlayer("Rola");  
      ComputerRPSPlayer e = new ComputerRPSPlayer("Preshi");
      ComputerRPSPlayer f = new ComputerRPSPlayer("Elo");
      ComputerRPSPlayer g = new ComputerRPSPlayer("Adeola");
      
      A.add(a);
      A.add(b);
      A.add(c);
      A.add(d);
      A.add(e);
      A.add(f);
      A.add(g);
      
      A.play();
      System.out.println("\n");
      A.sort();
      A.display();
      /*
      if(a.compareTo(b)>0){
         System.out.println("a greater than b");
      }
      
      if(c.compareTo(d)<0){
         System.out.println("c less than d");
      }

      if(e.compareTo(f)==0){
         System.out.println("e equals f");
      }*/

   }
}