/**
 * Driver for testing classes.
 *
 * @author Ojorumie Joe-Oka
 * @version 15th April 2021
 *
 */

import java.io.*;

public class Driver {
	public static void main(String [] args) throws IOException
	{
      /*
      WordList list = new WordList();
      Word converter;
      
      BufferedReader br = new BufferedReader(new FileReader("words.txt"));      
      String word = br.readLine();
     
      while (word != null) {
         converter = new Word(word); // Converts the word from type string to type Word 
         list.insert(converter);
         
         word = br.readLine();
	   }     
      br.close();

      list.display();
      
      
      Word a = new Word("good");
      Word b = new Word("good");
      
      if(a.equals(b))
         System.out.print(true);
      else
         System.out.print(false);
         
      System.out.print(a.hashCode());
      System.out.println();*/
      /*
      WordList p = new WordList();
      
      Word c,g; 
      c = new Word("help");
      g = new Word("hlp");
      
      p.insert(c);
      p.insert(g);
      p.display();
      //System.out.println();
      //p.remove(c);
      //p.display();
      //System.out.print(c.isAnagram(g));
      //p.search(c);*/
      CodeTimer time = new CodeTimer();
      
      time.start();
      LinkedDictionary a = new LinkedDictionary("../data/mywords.txt");
      //a.display();
      System.out.println();
      
      
      Word c = new Word("eat");
      System.out.println(a.countAnagrams(c));
      
      
      a.displayBigAnagramFamilies();
      time.stop();
      
      System.out.print(time);
	}
}

