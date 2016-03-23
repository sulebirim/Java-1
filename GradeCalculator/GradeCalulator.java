import javax.swing.JOptionPane;

public class GradeCalulator{

	//Vars
	private double grade;
	private double	outOff;
	private double	finalGrade;
	private double	finalOutOff;
	private final double CONSTANT = 100;
	private double output;

	//Con
	public GradeCalulator(){
		grade = 0.0;
		outOff = 0.0;
		finalGrade = 0.0;
		finalOutOff = 0.0;
		output = 0.0;
	}

	//set methods
	public void setGrade(double grade){
		this.grade = grade;
	}
	public void setOutOff(double outOff){
		this.outOff = outOff;
	}

	//compute
	public void computeGrade(){
		finalGrade = (grade/CONSTANT);
	}
	public void computeOutOff(){
		finalOutOff = (outOff/CONSTANT);
	}
	public void computeOutput(){
		output = (finalGrade*finalOutOff/CONSTANT);
	}

	//get method
	public double getOutput(){
		return output;
	}
	public double getFinalOutOff(){
			return finalOutOff;
	}
	public double getFinalGrade(){
			return finalGrade;
	}
}




