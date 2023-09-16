/**
 * Provides a simple word object that stores a word together with its letters
 * sorted.
 *
 * @author T.Sergeant
 * @version for Program Design 2
 *
 *
 */
import java.util.Arrays;

public class Word
{
	private String word;    // the word
	private String sorted;  // the word re-arranged so that its letters are sorted

	/**
	 * Store the word and create a sorted version of the word.
	 *
	 * @param word the word to be stored
	 */
	public Word(String word)
	{
		char [] letters= word.toCharArray();
		Arrays.sort(letters);
		this.word= word;
		this.sorted= new String(letters);
	}

	/**
	 * Just show the regular word when object is printed.
	 *
	 * @return the regular word
	 */
	public String toString()
	{
		return this.word + "(" + sorted + ")";
	}
   
   /**
    * Overrides the object class equals method
    *
    * @return true or false 
    *
    * </p>
    * Checks for equality using the alue of word
    * </p>
    */
   @Override
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Word))
         return false;
      if(this == obj) 
         return true;
      Word other = (Word) obj;
      return this.word.equals(other.word);
   }
   
   /**
    * Overrides the object class hashCode method
    *
    * @return the value of word.hashCode()
    */
   @Override
   public int hashCode() 
   { 
      return word.hashCode();
   }
   
   public boolean isAnagram(Word w)
   {
      return this.sorted.equals(w.sorted);
   }
}
