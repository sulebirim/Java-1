/*
 *RockPaperScissorsApp.java
 *@author Frances Sheridan
 *5th Nov 2012
 */
 import javax.swing.JOptionPane;
 public class RockPaperScissorsApp{
	 public static void main(String args[]){
		 String player1, winner;
		 int player2;

		 RockPaperScissors myRock = new RockPaperScissors();

		 player1 = JOptionPane.showInputDialog(null,"Please enter your choice, Rock, Paper or Scissors");
		 myRock.setPlayer1(player1);

		 myRock.compute();

		 winner = myRock.getWinner();
		 player2 = myRock.getPlayer2();

		 if(winner.equals("Player 1")){
			 if(player2==1){
		 		JOptionPane.showMessageDialog(null,"Congratulations, you have beaten the computer! The computer chose Rock");
			}
			else if(player2==2){
		 		JOptionPane.showMessageDialog(null,"Congratulations, you have beaten the computer! The computer chose Paper");
			}
			else{
		 		JOptionPane.showMessageDialog(null,"Congratulations, you have beaten the computer! The computer chose Scissors");
			}

		}
		else if(winner.equals("Player 2")){
			 if(player2==1){
		 		JOptionPane.showMessageDialog(null,"Hard Luck, you have been beaten by the computer! The computer chose Rock");
			}
			else if(player2==2){
		 		JOptionPane.showMessageDialog(null,"Hard Luck, you have been beaten by the computer!The computer chose Paper");
			}
			else{
		 		JOptionPane.showMessageDialog(null,"Hard Luck, you have been beaten by the computer! The computer chose Scissors");
			}

		}
		else if(winner.equals("draw")){
			 if(player2==1){
		 		JOptionPane.showMessageDialog(null,"It was a draw this time! The computer chose Rock");
			}
			else if(player2==2){
		 		JOptionPane.showMessageDialog(null,"It was a draw this time! The computer chose Paper");
			}
			else{
		 		JOptionPane.showMessageDialog(null,"It was a draw this time! The computer chose Scissors");
			}
		}
		else{

			JOptionPane.showMessageDialog(null, "You have entered an invalid option");
		}
	}
}