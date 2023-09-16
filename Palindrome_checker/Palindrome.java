/**
 * A Palindrome checker that accepts word to be checked for
 * from command line 
 *
 * @author  Ojorumie Joe-Oka
 * @version 4th April 2021
 *
*/
import java.util.Scanner;

public class Palindrome
{
	public static void main(String [] args)
	{
      if(args.length != 1){
         System.out.print("Error");
      }else if(args.length == 1){
         System.out.print("Evaluating string '"+ args[0] +"': ");
         System.out.print(isPalindrome(args[0]));
      }

	}
   
   /**
    * Check if a string passed into it is a palindrome or not 
    *
    * returns true or false 
    */
   public static boolean isPalindrome(String s){
      //System.out.print("Evaluating string '"+ s +"': ");
      boolean ans;
      int i = 0;
      int j = s.length() - 1;
      if(s.length() == 1||s.length()==0){
         return true;
      }
      else if(s.charAt(i) == s.charAt(j)){
            ans = isPalindrome(s.substring(i+1,j));
            return ans;         
      }      
      return false;
   }
}

