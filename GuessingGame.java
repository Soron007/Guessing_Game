
import java.util.Scanner;

class Guesser{
	int guessNum;
	
	public int guessNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guesser, kindly input number between 0-5");
		guessNum =  sc.nextInt();
		
		if(guessNum>5||guessNum<0) { //Feature 2: if guesser inputs number less than 0 or greater than 5, he is asked to input between 0-5
			System.out.println("Kindly input number between 0-5");
			guessNum =  sc.nextInt();
		}
		
		return guessNum;
	}
	
}

class Player{
	int guessNumofPlayer;
	
	public int guessNumber() {
		Scanner sc =new Scanner(System.in);
		guessNumofPlayer=sc.nextInt();
		return guessNumofPlayer;
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser()
	{
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
		
	}
	
	public void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		System.out.println("Player 1, Guess the number:"); 
		numFromPlayer1=p1.guessNumber();
		
		System.out.println("Player 2, Guess the number:");
		numFromPlayer2=p2.guessNumber();
		
		System.out.println("Player 3, Guess the number:");
		numFromPlayer3=p3.guessNumber();
		
		
	}
	
	void compare()
	{
		
		
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game tied all 3 players guessed correctly");
				System.out.println("Play again!");
			}
			
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 and Player 2 won the game");
				System.out.println("Player 1 and Player 2 will play the Finals");
				
				collectNumFromGuesser();
				Player p1=new Player();
				Player p2=new Player();
				
				System.out.println("Player 1, Guess the Number");
				numFromPlayer1=p1.guessNumber();
				
				System.out.println("Player 2, Guess the Number");
				numFromPlayer2=p2.guessNumber();
				
				if(numFromGuesser==numFromPlayer1) 
				{
					System.out.println("Player 1 is the champion!");
					
				}
				
				else 					
				{
					System.out.println("Player 2 is the Champion!");
				}
				
			}
			
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and Player 3 won ");
				System.out.println("Player 1 and Player 3 will play the Finals");
				
				collectNumFromGuesser();
				Player p1=new Player();
				Player p3=new Player();
				
				System.out.println("Player 1, Guess the Number");
				numFromPlayer1=p1.guessNumber();
				
				System.out.println("Player 3, Guess the Number");
				numFromPlayer3=p3.guessNumber();
				
				if(numFromGuesser==numFromPlayer1) {
					System.out.println("Player 1 is the champion!");
				}else {
					System.out.println("Player 3 is the Champion!");
				}
			}
			
			else 
			{
				System.out.println("Player 1 is the champion!");
			}
			
		}
		
		
		else if(numFromGuesser==numFromPlayer2)
		{
			
			if(numFromGuesser==numFromPlayer3)
			{
			System.out.println("Player 2 and Player 3 won the game");
			System.out.println("Player 2 and 3 will play the finals!");
			
			collectNumFromGuesser();
			Player p2=new Player();
			Player p3=new Player();
			
			System.out.println("Player 2, Guess the Number");
			numFromPlayer2=p2.guessNumber();
			
			System.out.println("Player 3, Guess the Number");
			numFromPlayer3=p3.guessNumber();
			
			if(numFromGuesser==numFromPlayer2) 
			{
				System.out.println("Player 2 is the champion!");
			}
			else 
			{
				System.out.println("Player 3 is the Champion!");
			}
			
			}
			
			else 
			
			{
				System.out.println("Player 2 is the Champion!");
			}
			
		}
		
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 is the Champion!");
		}
		
		else
		{
			System.out.println("Game lost! No one guessed correctly!");
			
		}
		
		
		
	}
}

class StartGame{
	public void startGame() {
		while(true) { 
			Umpire u = new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayer();
			u.compare();
			System.out.println();
		}
			
		
	}
}









public class GuessingGame {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the guessing game!");
		System.out.println();	
		StartGame start = new StartGame();
		
		start.startGame();
			
	}

}
