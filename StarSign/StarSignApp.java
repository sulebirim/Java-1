/*
*StarSignApp.java
*Vladislavs Vasiljevs
*23/03/16
*/

import javax.swing.JOptionPane;

public class StarSignApp{
	public static void main(String args []){

		//vars
		String month, sign;
		int date;

		//declare/create object

		StarSign mySign = new StarSign();


		//user input
		date = Integer.parseInt(JOptionPane.showInputDialog(null,"What date were you born on? (Format DD)"));
		mySign.setDate(date);

		month = JOptionPane.showInputDialog(null,"What month were you born in?");
		mySign.setMonth(month);

		//compute
		mySign.compute();

		//output
		sign = mySign.getSign();
		month = mySign.getMonth();

		if(date <= 0 || month.equals("")){
			JOptionPane.showMessageDialog(null,"Invaild Month or Date");
		}
		else{
			JOptionPane.showMessageDialog(null," Month: "+month+"  Date: "+date+"   Sign: "+sign);
		}
	}
}





