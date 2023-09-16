import java.util.Scanner;

public class Driver
{
	public static void main(String [] args)
	{
		RPSPlayerContainer player;
      player = new RPSPlayerContainer();
      ComputerRPSPlayer a = new ComputerRPSPlayer("Rumie");
      ComputerRPSPlayer b = new ComputerRPSPlayer("Lukie");
      player.add(a);
      player.add(b);
      player.display();
      System.out.println("\n");
      
      /*ComputerRPSPlayer a,c;
      HumanRPSPlayer b;
		a= new ComputerRPSPlayer("George");
		c= new ComputerRPSPlayer("Mary");
		*/
      
      System.out.println("0 is the code for "+ComputerRPSPlayer.translate(0));
		ComputerRPSPlayer a,b;
		a= new ComputerRPSPlayer("George");
		b= new ComputerRPSPlayer("Mary");

		System.out.println("0 is the code for "+ComputerRPSPlayer.translate(0));
		System.out.println("1 is the code for "+ComputerRPSPlayer.translate(1));
		System.out.println("2 is the code for "+ComputerRPSPlayer.translate(2));
		System.out.println("3 is the code for "+ComputerRPSPlayer.translate(3));
		System.out.println("---------------------------------");
      
      
      do
      {
         a.fight(b);
      }while(a.getWins()<3&&b.getWins()<3);
      
      System.out.println("\n");
      
      if(a.getWins()>b.getWins())
         System.out.println(a+"is the winner");
      else if(b.getWins()>a.getWins())
         System.out.println(b+ " is the winner");
         
      
		a.fight(b);
	}
}

