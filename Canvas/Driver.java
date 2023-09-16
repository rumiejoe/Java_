/**
 * Demonstrates ASCII image filling algorithm.
 *
 * @author  Your Name Here
 * @version for Program Design 2
 */

public class Driver
{
<<<<<<< HEAD
	public static void main(String [] args) 
	{
		MyCanvas canvas= new MyCanvas();
          
=======
	public static void main(String [] args)
	{
		MyCanvas canvas= new MyCanvas();
>>>>>>> 1073affb8b38d006b388952e84e62b6a0c5b0148

		canvas.load("image1.txt");
		canvas.setBorder('1');
		canvas.show();
<<<<<<< HEAD
	   canvas.fill('0',1,1);
		canvas.show();
      
      
=======
		canvas.fill('0',1,1);
		canvas.show();
>>>>>>> 1073affb8b38d006b388952e84e62b6a0c5b0148

		canvas.load("image2.txt");
		canvas.setBorder('*');
		canvas.show();
		canvas.fill('~',3,10);
		canvas.fill('.',1,1);
		canvas.fill('.',1,15);
		canvas.fill('X',8,14);
		canvas.show();

		canvas.load("image3.txt");
		canvas.setBorder('M');
		canvas.show();
		canvas.fill('~',27,50);
		canvas.fill('.',56,62);
		canvas.fill(' ',0,0);
		canvas.show();

		canvas.load("image4.txt");
		canvas.setBorder('M');
		canvas.show();
		canvas.fill(' ',60,101);
		canvas.fill(';',120,30);
		canvas.fill(';',130,160);
		canvas.show();
<<<<<<< HEAD
      
=======
>>>>>>> 1073affb8b38d006b388952e84e62b6a0c5b0148
	}
}
