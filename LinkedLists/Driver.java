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
        	LinkedDictionary a = new LinkedDictionary("../data/mywords.txt");
      		Word c = new Word("eat");
      		System.out.println(a.countAnagrams(c));
      		a.displayBigAnagramFamilies();
	}
}

