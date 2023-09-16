/**
 * Linked Dictionary
 *
 * @author Ojorumie Joe-Oka 
 * @version 15th April 2021 
 *
 */
import java.io.*;

public class LinkedDictionary extends WordList
{


   /**
    * Reds words from a file and insert into a linked list
    *
    * @param f file from which words to e inserted into linked list are taken
    */
   public LinkedDictionary(String f) throws IOException
   {
      Word converter;
      
      BufferedReader br = new BufferedReader(new FileReader(f));      
      String word = br.readLine();
     
      while (word != null) {
         converter = new Word(word);  
         insert(converter);
         word = br.readLine();
	   }     
      br.close();

   }
   
   
   /** 
    * Count the number of anagrams of a word in a list
    * 
    * @param w the Word for which anagram is to be searched 
    * 
    * @return the number of anagrams of w
    */
   public int countAnagrams(Word w)
   {
      WordNode p;
      p = head;
      int count = 0;
      while(p!=null){
         if(p.data.isAnagram(w)){
            count++;
         }
         p = p.next;
      }
      return count;   
   }
   
   
   /** 
    * Displays words with 6 or more anagrams 
    */
   public void displayBigAnagramFamilies()
   {
      int count;
      for(WordNode p=head; p!=null; p=p.next){
         count = 0;
         for(WordNode q=p.next; q!=null; q=q.next){
            if(p.data.isAnagram(q.data)){
               count++;
            }
         }
         if(count >=6){
            System.out.println(p.data);
         }
      }
   }
}