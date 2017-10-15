/*
 *RockPaperScissorsApp.java
 *@author Craig Sullivan
 06/05/2017
 */
 import javax.swing.JOptionPane;
 public class RockPaperScissorsApp{
	 public static void main(String args[]){
		 String player1, winner;
		 int player2;
		 int countPlayer1 = 0;
		 int countPlayer2 = 0;

		 RockPaperScissors myRock = new RockPaperScissors();
		//create loop
		for(int i = 0;i<3;i=i+1){
			player1 = JOptionPane.showInputDialog(null,"Please enter your choice, Rock, Paper or Scissors");
		 	myRock.setPlayer1(player1);

			myRock.compute();

			winner = myRock.getWinner();
			if(winner.equals("Player 1")){
				countPlayer1=countPlayer1+1;
			}
			else if(winner.equals("Player 2")){
				countPlayer2=countPlayer2+1;
			}
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

				JOptionPane.showMessageDialog(null, "You have entered an invalid option");			}
		}
		JOptionPane.showMessageDialog(null, "You won " + countPlayer1 + " games and the computer won " + countPlayer2 + "games");
	}
}
