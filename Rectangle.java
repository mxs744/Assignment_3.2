import java.util.Scanner;
import javax.swing.JOptionPane;
/** 
*Author: Michael Schreiber Exercise 3.2 Git
*Date: February 29, 2016 CSC200
*Contact Email: mxs744@gmail.com
*This Program is designed to output the area and perimeter of a rectangle based on user input
*
*/

public class Rectangle {
	public static void main(String [] args) {


	String strLength = "";
	String strHeight = "";
	String strPerimeter = "";
	String strArea = "";


	Double dblLength, dblHeight, dblPerimeter, dblArea;

	JOptionPane.showMessageDialog(null, "This program will give you the perimeter and area of a rectangle.");
	strLength = JOptionPane.showInputDialog("Enter the length here. ");
	strHeight = JOptionPane.showInputDialog("Enter the height here. ");

	dblLength = Double.parseDouble(strLength);
	dblHeight = Double.parseDouble(strHeight);

	dblPerimeter = dblLength * 2 + dblHeight * 2;
	dblArea = dblLength * dblHeight;

	JOptionPane.showMessageDialog(null, ("The perimeter of your rectangle is " + dblPerimeter + " units and the area is " + dblArea + " square units"));

	}
}

