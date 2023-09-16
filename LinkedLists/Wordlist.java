/**
 * A linked list of string values.
 *
 * @author Ojorumie Joe-Oka 
 * @version 15th April 2021
 *
 */
public class WordList
{
	protected WordNode head;

	/**
	 * A new list has head pointing nowhere.
	 */
	public WordList()
	{
		head= null;
	}


	/**
	 * Displays contents of the list.
	 */
	public void display()
	{
      for(WordNode p=head; p!=null; p=p.next){
         System.out.println(p.data);
      }
	}


	/**
	 * In an unordered list we can just add to the front.
	 *
	 * @param newdata The new element to be inserted into the list.
	 */
	public void insert(Word newdata)
	{
      WordNode p = new WordNode();
      p.data = newdata;
      p.next = head;
      head = p;

	}


	/**
	 * Search the list for the value val.
	 *
	 * @param val the value to be searched for
	 * @return reference to the found Word (null if not found)
	 */
	public Word search(Word val)
	{
      WordNode p;
      p = head;
      if(head == null)
         return null;
      else{
          while(p != null  && !(p.data.equals(val))){
            if(p.data.equals(val))
               return p.data;
            p = p.next;
         }
      }
		return null;
	}


	/**
	 * Find first occurrence of val (if it exists) and remove it from the list.
	 *
	 * @param val the value to be removed
	 */
	public void remove(Word val)
	{
      WordNode p,q;
      q = null;
      p = head;
      while(!(p.data.equals(val))){
         q = p;
         p = p.next;
      }
      if(head == null||p==null){
         return;
      }else if(head.data.equals(val)){
         head = head.next;
      }else{
         q.next = p.next;
      
      }
	}
}
