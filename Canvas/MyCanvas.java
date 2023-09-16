import java.util.*;
import java.io.*;


public class MyCanvas
{

   public int rows;
   private int columns;
   private char [][] array;
   private char border;
   
   
   public void load(String dataFile)
   {

      try{
         Scanner fin = new Scanner(new File(dataFile));
         rows = fin.nextInt();
         columns = fin.nextInt();
         array = new char[rows][columns];
         String str;
         str = fin.nextLine();
         char [] ch;
         
         
         for(int i=0; i<rows; i++){
            str = fin.nextLine();
            ch = str.toCharArray();
            
            for(int j=0; j<columns; j++){
               array[i][j] = ch[j];
            }
         } 
      }
      
      catch(FileNotFoundException a){
         System.out.println("File Not Found");
         System.out.println(a);
      } 
   }
   
   
   public void show(){
      for(int i=0; i<rows; i++){
         for(int j=0; j<columns; j++)
            System.out.print(array[i][j]);                  
         System.out.println();
      }

   }
   
   public void setBorder(char ch){
      border =ch;
       
   }
   
   public void fill(char ch, int r, int c){
      
      if(r==rows || c==columns || r < 0 || c < 0 || array[r][c] == border||ch == array[r][c])
         return;
      else{
         array[r][c]= ch;
      
         fill(ch,r+1,c);
         fill(ch,r-1,c);
         fill(ch,r,c+1);
         fill(ch,r,c-1);
      }
            
   
   }

}