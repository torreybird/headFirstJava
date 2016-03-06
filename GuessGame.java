public class GuessGame {
	Player p1; //instance variable for Player object p1
	Player p2; //instance variable for Player object p2
	Player p3; //instance variable for Player object p3
	
	public void startGame() {
		//create player objects and assign them to the Player instance variables
		p1 = new Player(); 
		p2 = new Player();
		p3 = new Player();
		
		//declare one variable for each player, to hold the guesses the players make, set to zero to start
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		//declare one variable for each player's guess rightness
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		//declare a variable for the guessable number
		int targetNumber = (int) (Math.random() * 10);
		
		while(true) {
			System.out.println("Number to guess is: " + targetNumber);
			
			//call the .guess method on each player; make 'em guess
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number; //get the number the player guessed
			System.out.println("Player One guessed: " + guessp1); //print it to the command line
			
			guessp2 = p2.number; //get the number the player guessed
			System.out.println("Player Two guessed: " + guessp2); //print it to the command line			

			guessp3 = p3.number; //get the number the player guessed
			System.out.println("Player Three guessed: " + guessp3); //print it to the command line
			
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				break; //game is over, so break out of the loop!
			} else {
				System.out.println("Hotel California rules: Players must try again.");
			} //end if/else
		} //end loop
	} //end method
} //end class