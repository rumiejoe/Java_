/**
 * List-based Stack class. 
 *
 * @author Ojorumie Joe-Oka
 * @version 28th April 2021
 *
 */

public class MyStack
{
   ListNode top;
      
   public MyStack()
   {
      top = null;
   }
   
   
   /**
    * Adds a value to the list.
    *
    * @param val value to be added to the list
    */
   public void push(char val)
   {
      ListNode p = new ListNode();
      p.data = val;
      p.next = top;
      top = p;
   }
   
   /**
    * Pop the last number inserted into the list.
    *
    * @return the last number inserted into the list
    */
   public char pop()
   {
      ListNode p = top;
      top = p.next;
      return p.data;
   }
   
   
   /**
    * Checks if the list is empty.
    *
    * @return true or false
    */
   public boolean empty(){ return top == null; }
   
   /**
    * Check if string has properly matched parentheses.
    *
    * @param str String to be checked
    *
    * @return true or false
    */
   public boolean checkParens(String str)
   {
      for(int i = 0;i<str.length();i++)
      {
         if(str.charAt(i) == '('){
            push(str.charAt(i));
         }
         if(str.charAt(i) == ')'){
            if(empty())
               return false;
            pop();
         }
      }
      
      if(!empty())
         return false;
      
      return true;
   }

}