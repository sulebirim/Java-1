/*
*BoxCountApp.java
*16/02/16
*@author Vladislavs Vasiljevs
*/

import javax.swing.JOptionPane;

public class BoxCountApp{
	public static void main(String args[]){
		//declare variables
		int eggs, boxes, over;

		//declare objects
		BoxCount myBoxCount;

		//create objects
		myBoxCount = new BoxCount();

		//input from users
		eggs = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Number of eggs Collected"));
		myBoxCount.setEggs(eggs);

		//compute
		myBoxCount.computeBoxes();
		myBoxCount.computeOver();

		//output
		boxes = myBoxCount.getBoxes();
		JOptionPane.showMessageDialog(null, "Amount of Boxes = "+ boxes);

		over = myBoxCount.getOver();
		JOptionPane.showMessageDialog(null, "Left over = "+ over);
	}
}