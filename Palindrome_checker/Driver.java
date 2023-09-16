/**
 * Driver Class. 
 *
 *
 *@author Ojorumie Joe-Oka
 *@version 7th April 2021 
 *
 */

import java.io.*;

public class Driver{
   public static void main(String [] args)throws IOException{
      if(args.length > 1){
         System.out.print("Error : Only one file can be read");
      }else if(args.length == 0){
         System.out.print("Error: No file to be read from");
      }else{
         PalindromeChecker pal = new PalindromeChecker(args[0]);
         pal.display();
      }
   }
}