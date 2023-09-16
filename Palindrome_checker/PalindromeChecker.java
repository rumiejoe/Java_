/** 
 * File Reader and Palindrome Checker. 
 *
 *
 *@author Ojorumie Joe-Oka 
 *@version 7th April 2021
 *
 *
 * A class that reads the words from the file and check 
 * if they are palindromes.
 */
import java.io.*;
public class PalindromeChecker {
   String dataFile;
   int cnt;
   int counter;  
   CodeTimer time;

   /**
    * Constructor class 
    *
    *@param dataFile file from which words to be checked for
    * palindrome nature is read.
    */
   public PalindromeChecker(String dataFile) throws IOException
   {
      this.dataFile = dataFile;
      BufferedReader fin = new BufferedReader(new FileReader(dataFile));
      time = new CodeTimer();
      cnt = 0;
      String word = fin.readLine();
     
      time.start(); // Starts the timer 
      while (word != null) {
	      cnt++;
         if(isPalindrome(word)){
            counter++;
         }
         word = fin.readLine();
	   }
      time.stop(); //Stops the timer
      
         
      
      fin.close();
   }
   
   /**
    * Checks if a word is a palindrome
    *
    *@param s the word to be checked for palindrome nature 
    * 
    * returns true or false
    */
   
   public boolean isPalindrome(String s){
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
   
   
   
   /**
    * Dislays Statistics.
    * 
    * Displays the statistics of the palindrome check on the
    * words in the file 
    */
   public void display(){
      int pal = counter;// the number of palindromes 
      double palperc = ((pal*1.0)/(cnt*1.0))*100;//the percentage of palindromes 
      System.out.printf("%-15s %s","Input File",":"  + dataFile);
      System.out.println();
      System.out.printf("%-15s %s","Words Processed",":"  + cnt);
      System.out.println();
      System.out.printf("%-15s %s","# Palindromes",":"  + pal);
      System.out.println();
      System.out.printf("%-15s %s","% Palindromes",":");
      System.out.printf("%.3f",palperc);
      System.out.println("%");
      System.out.printf("%-15s %s","Time elapsed",":" );
      System.out.println(time);
      
   }

}