/**
 * Driver for testing MyStack.
 *
 * @author Ojorumie Joe-Oka 
 * @version 28th April 2021
 *
 */

public class Driver
{
	public static void main(String [] args)
	{
		MyStack s= new MyStack();
      
      System.out.print(s.checkParens("(hi there (how)(are)(you (doing (today))) now)"));
	}
}

