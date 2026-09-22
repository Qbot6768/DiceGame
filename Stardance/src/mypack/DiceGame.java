package mypack;
import java.util.Scanner;

public class DiceGame {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dice Game");
		System.out.println("---------");
		
		System.out.println();
		
		//Welcomes the user and asks for the betting amount
		System.out.print("Welcome to Dice Game! Please enter a betting amount between $1 and $20: ");
		double money = scan.nextDouble();
		
		if((money < 1) || (money > 20)) {
			
			//Prints out an error message to the user
			System.out.println();
			System.out.println("ERROR: THE AMOUNT YOU ENTERED IS INVALID, PLEASE TRY AGAIN");
			
			Thread.sleep(3000);
			
			DiceGame dice = new DiceGame();
			dice.main(args);
			
		}
		
		else {
			
			//Creates the users first roll
			int diceRoll;
			diceRoll = (int) (Math.random () * 6 + 1);
			
			//Creates the users second roll
			int diceRoll2;
			diceRoll2 = (int) (Math.random () * 6 + 1);
			
			//Creates the computers first roll
			int botRoll;
			botRoll = (int) (Math.random () * 6 + 1);
			
			//Creates the computers second roll
			int botRoll2;
			botRoll2 = (int) (Math.random () * 6 + 1);
			
			System.out.println();
			
			//Outputs the users first roll
			System.out.print("Your first roll was");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(" " + diceRoll);
			System.out.println();
			Thread.sleep(1500);
			
			//Asks the user a question
			System.out.print("Would you like to 1. Double your bet 2. Keep your bet the same 3. Quit and lose half your bet: ");
			int answer = scan.nextInt();
			System.out.println();
			Thread.sleep(1500);
			
			if(answer == 1) {
				
				//Doubles the users bet
				money = money * 2;
				
				//Tells the user their bet has been doubled
				System.out.println("Great! Your bet has been doubled to $" + money);
				Thread.sleep(2000);
				
				System.out.println();
				
				System.out.print("Your total roll is");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(". ");
				Thread.sleep(1000);
				System.out.print(diceRoll + diceRoll2);
				System.out.println();
				Thread.sleep(1500);
				
				System.out.print("The computers total roll is");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(". ");
				Thread.sleep(1000);
				System.out.print(botRoll + botRoll2);
				
				if((botRoll + botRoll2) > (diceRoll + diceRoll2)) {
					
					System.out.println();
					System.out.println("Sorry, the bot beat you this time. You just lost $" + money);
					Thread.sleep(4000);
					
					System.out.println();
					System.out.print("Restarting in: ");
					Thread.sleep(1000);
					System.out.print("3, ");
					Thread.sleep(1000);
					System.out.print("2, ");
					Thread.sleep(1000);
					System.out.print("1...");
					Thread.sleep(1000);
					
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					
					DiceGame game = new DiceGame();
					game.main(args);
		
				}
				
				if((botRoll + botRoll2) < (diceRoll + diceRoll2)) {
					
					System.out.println();
					System.out.println("Congrats! You beat the bot and have gained $" + money);
					Thread.sleep(4000);
					
					System.out.println();
					System.out.print("Restarting in: ");
					Thread.sleep(1000);
					System.out.print("3, ");
					Thread.sleep(1000);
					System.out.print("2, ");
					Thread.sleep(1000);
					System.out.print("1...");
					Thread.sleep(1000);
					
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					
					DiceGame game = new DiceGame();
					game.main(args);
					
				}
				
				if((botRoll + botRoll2) == (diceRoll + diceRoll2)) {
					
					System.out.println();
					System.out.println("Awwwww it was a tie! You don't gain anything but keep your $" + money);
					Thread.sleep(4000);
					
					System.out.println();
					System.out.print("Restarting in: ");
					Thread.sleep(1000);
					System.out.print("3, ");
					Thread.sleep(1000);
					System.out.print("2, ");
					Thread.sleep(1000);
					System.out.print("1...");
					Thread.sleep(1000);
					
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					
					DiceGame game = new DiceGame();
					game.main(args);
					
				}

				
			}
			
			if(answer == 2) {
				
				System.out.println("Great! Your bet will stay at $" + money);
				System.out.println();
				Thread.sleep(2000);
				
				System.out.print("Your total roll is");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(". ");
				Thread.sleep(1000);
				System.out.print(diceRoll + diceRoll2);
				Thread.sleep(1000);
				System.out.println();
				
				System.out.print("The computers total roll is");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(". ");
				Thread.sleep(1000);
				System.out.print(botRoll + botRoll2);
				
				if((botRoll + botRoll2) > (diceRoll + diceRoll2)) {
					
					System.out.println();
					System.out.println("Sorry, the bot beat you this time. You just lost $" + money);
					Thread.sleep(4000);
					
					System.out.println();
					System.out.print("Restarting in: ");
					Thread.sleep(1000);
					System.out.print("3, ");
					Thread.sleep(1000);
					System.out.print("2, ");
					Thread.sleep(1000);
					System.out.print("1...");
					Thread.sleep(1000);
					
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					
					DiceGame game = new DiceGame();
					game.main(args);
		
				}
				
				if((botRoll + botRoll2) < (diceRoll + diceRoll2)) {
					
					System.out.println();
					System.out.println("Congrats! You beat the bot and have gained $" + money);
					Thread.sleep(4000);
					
					System.out.println();
					System.out.print("Restarting in: ");
					Thread.sleep(1000);
					System.out.print("3, ");
					Thread.sleep(1000);
					System.out.print("2, ");
					Thread.sleep(1000);
					System.out.print("1...");
					Thread.sleep(1000);
					
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					
					DiceGame game = new DiceGame();
					game.main(args);
					
				}
				
				if((botRoll + botRoll2) == (diceRoll + diceRoll2)) {
					
					System.out.println();
					System.out.println("Awwwww it was a tie! You don't gain anything but keep your $" + money);
					Thread.sleep(4000);
					
					System.out.println();
					System.out.print("Restarting in: ");
					Thread.sleep(1000);
					System.out.print("3, ");
					Thread.sleep(1000);
					System.out.print("2, ");
					Thread.sleep(1000);
					System.out.print("1...");
					Thread.sleep(1000);
					
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					
					DiceGame game = new DiceGame();
					game.main(args);
					
				}
				
			}
		
			if(answer == 3) {

				
				System.out.println();
				System.out.println("Your choice I guess");
				System.out.println();
				
				System.out.print("Program will quit in 5 seconds");
				Thread.sleep(5000);
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				System.exit(0);
				
}
			
			else {
				
				System.out.println();
				System.out.println("ERROR: INVALID INPUT, TERMINATING IN 3 SECONDS");
				Thread.sleep(3000);
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				System.exit(0);

}
}
}
}