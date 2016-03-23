import javax.swing.JOptionPane;

public class GradeCalulatorApp{
	public static void main(String args[]){

		//var
		double grade, outOff, output, finalGrade, finalOutOff;

		//declare/create object
		GradeCalulator myGrade = new GradeCalulator();

		//input from user
		grade = Double.parseDouble(JOptionPane.showInputDialog(null,"What is"));
		myGrade.setGrade(grade);

		outOff = Double.parseDouble(JOptionPane.showInputDialog(null,"of "));
		myGrade.setOutOff(outOff);

		//compute
		myGrade.computeGrade();
		myGrade.computeOutOff();
		myGrade.computeOutput();

		//output
		output = myGrade.getOutput();
		finalGrade = myGrade.getFinalGrade();
		finalOutOff = myGrade.getFinalOutOff();
		JOptionPane.showMessageDialog(null,"Whis is "+finalGrade+"%"+" of "+finalOutOff+"%"+" = "+output);

	}
}