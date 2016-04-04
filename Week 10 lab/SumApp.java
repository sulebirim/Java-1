import javax.swing.JOptionPane;

public class SumApp{
	public static void main(String args[]){

		int num;

		Sum mySum = new Sum();


		num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a Number"));
		mySum.setNum(num);

		int sum = 0;
		for (int i = 1; i < num; i++) {
		      sum += i;
		      System.out.println(sum);
		 }
	}
}


